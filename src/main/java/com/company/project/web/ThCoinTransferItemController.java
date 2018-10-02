package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.PageResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ThCoinTransferItem;
import com.company.project.service.ThCoinTransferItemService;
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
@RequestMapping("/th/coin/transfer/item")
public class ThCoinTransferItemController {
    @Resource
    private ThCoinTransferItemService thCoinTransferItemService;

    @PostMapping("/add")
    public Result add(ThCoinTransferItem thCoinTransferItem) {
        thCoinTransferItemService.save(thCoinTransferItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        thCoinTransferItemService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ThCoinTransferItem thCoinTransferItem) {
        thCoinTransferItemService.update(thCoinTransferItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ThCoinTransferItem thCoinTransferItem = thCoinTransferItemService.findById(id);
        return ResultGenerator.genSuccessResult(thCoinTransferItem);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "0") Integer pageSize) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<ThCoinTransferItem> data = thCoinTransferItemService.findAll();
        PageResult<List<ThCoinTransferItem>> result = new PageResult<>() ;
        result.setResult(data);
        result.setPageNum(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setTotal(page.getTotal());
        return ResultGenerator.genSuccessResult(result);
    }
}
