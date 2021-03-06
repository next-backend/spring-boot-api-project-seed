package com.company.project.biz.impl;

import com.company.project.biz.AccountCore;
import com.company.project.model.ThCoinItem;
import com.company.project.service.ThCoinAccountService;
import com.company.project.service.ThCoinItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountCoreImpl implements AccountCore {
    @Autowired
    ThCoinAccountService thCoinAccountService;
    @Autowired
    ThCoinItemService thCoinItemService;

    @Override
    public void balancePlus(ThCoinItem item) {
        Long brandId = item.getBrandOwner();
        Integer type = item.getType();
        Long samePeriodId = item.getSamePeriodId();
        thCoinAccountService.balancePlus(brandId, type, samePeriodId, item.getAmount());
        thCoinItemService.amountPlus(item);
    }
}
