package com.conpany.project;

import com.company.project.biz.config.Yn;
import com.company.project.model.ThCoinItem;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.apache.commons.beanutils.BeanUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AccountWebTest extends BaseWebTest {
    private static final String RESOURCE_PATH = "http://localhost:8080/th/coin/account" ;

    @Test
    public void list() throws Exception {
        HashMap<String, String> params = Maps.newHashMap() ;
        params.put("pageNum",0 + "");
        params.put("pageSize",10 + "");
        MockUtil.mockPost(mockMvc, RESOURCE_PATH +"/list",params);
    }

    @Test
    public void balancePlus() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse("2017-11-30 00:00:00") ;
        Date end = sdf.parse("2018-11-30 23:59:59") ;
        ThCoinItem item = new ThCoinItem() ;
        item.setAmount(100L);
        item.setTs(new Date());
        item.setStartTime(start);
        item.setEndTime(end);
        item.setType(80);
        item.setBrandOwner(2050L);
        item.setSamePeriodId(0L);
        item.setYn(Yn.Yes.getCode());
        Map<String, String> params = BeanUtils.describe(item)  ;
        TaskRunner task1 = new TaskRunner() {
            @Override
            protected void call() {
                try {
                    MockUtil.mockPost(mockMvc, RESOURCE_PATH +"/balance/plus",params);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } ;
        item.setBrandOwner(2051L);
        TaskRunner task2 = new TaskRunner() {
            @Override
            protected void call() {
                try {
                    MockUtil.mockPost(mockMvc, RESOURCE_PATH +"/balance/plus",params);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } ;
        item.setBrandOwner(2052L);
        TaskRunner task3 = new TaskRunner() {
            @Override
            protected void call() {
                try {
                    MockUtil.mockPost(mockMvc, RESOURCE_PATH +"/balance/plus",params);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } ;
        TaskUtil.runTask(task1,task2,task3);

    }

}