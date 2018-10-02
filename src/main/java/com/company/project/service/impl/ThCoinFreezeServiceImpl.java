package com.company.project.service.impl;

import com.company.project.dao.ThCoinFreezeMapper;
import com.company.project.model.ThCoinFreeze;
import com.company.project.service.ThCoinFreezeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
@Service
@Transactional
public class ThCoinFreezeServiceImpl extends AbstractService<ThCoinFreeze> implements ThCoinFreezeService {
    @Resource
    private ThCoinFreezeMapper thCoinFreezeMapper;

}
