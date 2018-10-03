package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.PageResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ThCoinTransfer;
import com.company.project.service.ThCoinTransferService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/10/03.
*/
@RestController
@RequestMapping("/th/coin/transfer")
public class ThCoinTransferController {
    @Resource
    private ThCoinTransferService thCoinTransferService;

    @PostMapping("/add")
    public Result add(ThCoinTransfer thCoinTransfer) {
        thCoinTransferService.save(thCoinTransfer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Long id) {
        thCoinTransferService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ThCoinTransfer thCoinTransfer) {
        thCoinTransferService.update(thCoinTransfer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        ThCoinTransfer thCoinTransfer = thCoinTransferService.findById(id);
        return ResultGenerator.genSuccessResult(thCoinTransfer);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "0") Integer pageSize) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<ThCoinTransfer> data = thCoinTransferService.findAll();
        PageResult<List<ThCoinTransfer>> result = new PageResult<>() ;
        result.setResult(data);
        result.setPageNum(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setTotal(page.getTotal());
        return ResultGenerator.genSuccessResult(result);
    }
}
