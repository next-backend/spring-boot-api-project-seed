package com.company.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.company.project.biz.config.Yn;
import com.company.project.core.AbstractService;
import com.company.project.dao.ThCoinItemMapper;
import com.company.project.model.ThCoinItem;
import com.company.project.service.ThCoinItemService;
import com.company.project.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

import javax.annotation.Resource;
import java.util.Date;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
@Slf4j
@Service
public class ThCoinItemServiceImpl extends AbstractService<ThCoinItem> implements ThCoinItemService {
    @Resource
    private ThCoinItemMapper thCoinItemMapper;

    @Override
    public void amountPlus(ThCoinItem item) {
        Long amount = item.getAmount();
        Long samePeriodId = item.getSamePeriodId();
        ThCoinItem sourceItem = null;
        if (samePeriodId > 0) {
            item.setYn(Yn.Yes.getCode());
            sourceItem = this.selectOne(item.getBrandOwner(), item.getType(), samePeriodId);
            if (sourceItem != null) {
                sourceItem.setAmount(sourceItem.getAmount() + amount);
                item = null;
            }
        } else {
            sourceItem = this.selectNegative(item.getBrandOwner(), item.getType(), samePeriodId);
            Long negativeAmount = sourceItem == null ? 0L : sourceItem.getAmount();
            log.info("负值金额，{},negativeAmount:{}", negativeAmount);

            if (negativeAmount < 0) {
                //负值处理逻辑
                negativeAmount += amount;
                if (negativeAmount < 0) {
                    sourceItem.setAmount(negativeAmount);
                    item = null;
                } else if (negativeAmount == 0) {
                    item = null;
                    sourceItem.setAmount(negativeAmount);
                } else {
                    sourceItem.setAmount(0L);
                    item.setAmount(negativeAmount);
                }
            } else {
                Yn yn;
                if (DateUtil.checkeCurrentDateExpired(item.getEndTime())) {
                    yn = Yn.No;
                } else {
                    yn = Yn.Yes;
                }
                item.setYn(yn.getCode());
                sourceItem = this.selectByDay(item.getBrandOwner(), item.getType(), samePeriodId, item.getEndTime());
                if (sourceItem != null) {
                    sourceItem.setAmount(sourceItem.getAmount() + amount);
                    item = null;
                }
            }
        }
        log.info("待入账金额明细: {}", JSON.toJSONString(item));
        if (sourceItem == null) {
            thCoinItemMapper.insert(item);
            log.info("同期金额明细不存在，新增: {}", JSON.toJSONString(item));
        } else {
            if (sourceItem.getAmount() == 0) {
                this.deleteWithVersion(sourceItem.getId()) ;
            } else {
                this.updateByPrimaryKeyWithVersion(sourceItem) ;
            }
            if (item != null) {
                thCoinItemMapper.insert(item);
            }
            log.info("同期金额明细存在，更新明细: {}，增加金额：{}", JSON.toJSONString(sourceItem), amount);
        }
    }

    @Override
    public ThCoinItem selectNegative(Long brandOwner, Integer type, Long samePeriodId) {
        return thCoinItemMapper.selectOneByExample(new Example.Builder(ThCoinItem.class)
                .where(WeekendSqls.<ThCoinItem>custom()
                        .andEqualTo(ThCoinItem::getBrandOwner, brandOwner)
                        .andEqualTo(ThCoinItem::getType, type)
                        .andEqualTo(ThCoinItem::getYn, Yn.Yes.getCode())
                        .andLessThan(ThCoinItem::getAmount, 0)).build());
    }

    @Override
    public ThCoinItem selectOne(Long brandOwner, Integer type, Long samePeriodId) {
        Assert.isTrue(samePeriodId > 0, "samePeriodId 必须为0");
        return thCoinItemMapper.selectOneByExample(new Example.Builder(ThCoinItem.class)
                .where(WeekendSqls.<ThCoinItem>custom()
                        .andEqualTo(ThCoinItem::getBrandOwner, brandOwner)
                        .andEqualTo(ThCoinItem::getType, type)
                        .andEqualTo(ThCoinItem::getYn, Yn.Yes.getCode())
                        .andEqualTo(ThCoinItem::getSamePeriodId, samePeriodId)
                ).build());
    }

    @Override
    public ThCoinItem selectByDay(Long brandOwner, Integer type, Long samePeriodId, Date endTime) {
        Example condition = new Example(ThCoinItem.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("brandOwner", brandOwner)
                .andEqualTo("samePeriodId", samePeriodId)
                .andEqualTo("type", type)
                .andEqualTo("yn", Yn.Yes.getCode())
                .andCondition("date_format(end_time,'%Y%m%d') = " + DateUtil.formatYyyyMMdd(endTime) + " ");
        return thCoinItemMapper.selectOneByExample(condition);
    }
}
