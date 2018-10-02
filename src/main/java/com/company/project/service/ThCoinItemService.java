package com.company.project.service;
import com.company.project.model.ThCoinItem;
import com.company.project.core.Service;

import java.util.Date;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
public interface ThCoinItemService extends Service<ThCoinItem> {

    void amountPlus(ThCoinItem item) ;

    ThCoinItem selectNegative(Long brandOwner, Integer type, Long samePeriodId);

    ThCoinItem selectOne(Long brandOwner, Integer type, Long samePeriodId);

    ThCoinItem selectByDay(Long brandOwner, Integer type, Long samePeriodId, Date endTime);

}
