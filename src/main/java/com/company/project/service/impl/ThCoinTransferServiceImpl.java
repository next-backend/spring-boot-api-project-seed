package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.dao.ThCoinTransferMapper;
import com.company.project.model.ThCoinTransfer;
import com.company.project.service.ThCoinTransferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/10/03.
 */
@Service
public class ThCoinTransferServiceImpl extends AbstractService<ThCoinTransfer> implements ThCoinTransferService {
    @Resource
    private ThCoinTransferMapper thCoinTransferMapper;

}
