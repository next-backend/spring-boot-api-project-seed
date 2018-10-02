package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.PageResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ThCoinTrade;
import com.company.project.service.ThCoinTradeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/10/02.
*/
@RestController
@RequestMapping("/th/coin/trade")
public class ThCoinTradeController {
    @Resource
    private ThCoinTradeService thCoinTradeService;

    @PostMapping("/add")
    public Result add(ThCoinTrade thCoinTrade) {
        thCoinTradeService.save(thCoinTrade);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        thCoinTradeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ThCoinTrade thCoinTrade) {
        thCoinTradeService.update(thCoinTrade);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ThCoinTrade thCoinTrade = thCoinTradeService.findById(id);
        return ResultGenerator.genSuccessResult(thCoinTrade);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "0") Integer pageSize) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<ThCoinTrade> data = thCoinTradeService.findAll();
        PageResult<List<ThCoinTrade>> result = new PageResult<>() ;
        result.setResult(data);
        result.setPageNum(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setTotal(page.getTotal());
        return ResultGenerator.genSuccessResult(result);
    }
}
