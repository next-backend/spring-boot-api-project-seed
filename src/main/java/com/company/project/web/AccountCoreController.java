package com.company.project.web;


import com.company.project.biz.AccountCore;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ThCoinItem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/th/coin/account")
public class AccountCoreController {

    @Resource
    private AccountCore accountCore;

    @PostMapping("/balance/plus")
    public Result balancePlus(@RequestBody ThCoinItem item) {
        accountCore.balancePlus(item);
        return ResultGenerator.genSuccessResult();
    }
}
