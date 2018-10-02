package com.company.project.service.impl;

import com.company.project.dao.ThCoinTransferItemMapper;
import com.company.project.model.ThCoinTransferItem;
import com.company.project.service.ThCoinTransferItemService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/02.
 */
@Service
@Transactional
public class ThCoinTransferItemServiceImpl extends AbstractService<ThCoinTransferItem> implements ThCoinTransferItemService {
    @Resource
    private ThCoinTransferItemMapper thCoinTransferItemMapper;

}
