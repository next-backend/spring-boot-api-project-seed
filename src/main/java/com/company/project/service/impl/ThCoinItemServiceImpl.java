package com.company.project.service.impl;

import com.company.project.dao.ThCoinItemMapper;
import com.company.project.model.ThCoinItem;
import com.company.project.service.ThCoinItemService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
@Service
@Transactional
public class ThCoinItemServiceImpl extends AbstractService<ThCoinItem> implements ThCoinItemService {
    @Resource
    private ThCoinItemMapper thCoinItemMapper;

}
