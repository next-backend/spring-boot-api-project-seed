package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.dao.ThCoinFreezeItemMapper;
import com.company.project.model.ThCoinFreezeItem;
import com.company.project.service.ThCoinFreezeItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/03.
 */
@Service
public class ThCoinFreezeItemServiceImpl extends AbstractService<ThCoinFreezeItem> implements ThCoinFreezeItemService {
    @Resource
    private ThCoinFreezeItemMapper thCoinFreezeItemMapper;

}
