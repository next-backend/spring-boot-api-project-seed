package com.company.project.service;
import com.company.project.model.ThCoinAccount;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
public interface ThCoinAccountService extends Service<ThCoinAccount> {

    ThCoinAccount findOne(Long brandId, Integer type, Long samePeriodId) ;

    void balancePlus(Long brandId, Integer type, Long samePeriodId,Long money) ;
}
