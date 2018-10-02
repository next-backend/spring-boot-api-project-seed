package com.company.project.service.impl;

import com.company.project.dao.ThCoinTradeMapper;
import com.company.project.model.ThCoinTrade;
import com.company.project.service.ThCoinTradeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
@Service
@Transactional
public class ThCoinTradeServiceImpl extends AbstractService<ThCoinTrade> implements ThCoinTradeService {
    @Resource
    private ThCoinTradeMapper thCoinTradeMapper;

}
