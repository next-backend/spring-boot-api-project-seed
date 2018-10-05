package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.dao.ThCoinAccountMapper;
import com.company.project.model.ThCoinAccount;
import com.company.project.service.ThCoinAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
@Service
public class ThCoinAccountServiceImpl extends AbstractService<ThCoinAccount> implements ThCoinAccountService {
    @Resource
    private ThCoinAccountMapper thCoinAccountMapper;

    @Override
    public ThCoinAccount findOne(Long brandId, Integer type, Long samePeriodId) {
        ThCoinAccount condition = new ThCoinAccount() ;
        condition.setBrandOwner(brandId);
        condition.setType(type);
        condition.setSamePeriodId(samePeriodId);
        return thCoinAccountMapper.selectOne(condition) ;
    }

    @Override
    public void balancePlus(Long brandId, Integer type, Long samePeriodId, Long money) {
        ThCoinAccount account = this.findOne(brandId, type, samePeriodId);
        if (account != null) {
            account.setBalance(account.getBalance() + money);
            this.updateByPrimaryKeyWithVersion(account);
        }
    }
}
