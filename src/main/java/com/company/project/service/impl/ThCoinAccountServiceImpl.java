package com.company.project.service.impl;

import com.company.project.dao.ThCoinAccountMapper;
import com.company.project.model.ThCoinAccount;
import com.company.project.service.ThCoinAccountService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
@Service
@Transactional
public class ThCoinAccountServiceImpl extends AbstractService<ThCoinAccount> implements ThCoinAccountService {
    @Resource
    private ThCoinAccountMapper thCoinAccountMapper;

}
