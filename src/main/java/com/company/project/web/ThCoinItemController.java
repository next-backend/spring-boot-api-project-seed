package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.PageResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ThCoinItem;
import com.company.project.service.ThCoinItemService;
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
@RequestMapping("/th/coin/item")
public class ThCoinItemController {
    @Resource
    private ThCoinItemService thCoinItemService;

    @PostMapping("/add")
    public Result add(ThCoinItem thCoinItem) {
        thCoinItemService.save(thCoinItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Long id) {
        thCoinItemService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ThCoinItem thCoinItem) {
        thCoinItemService.update(thCoinItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        ThCoinItem thCoinItem = thCoinItemService.findById(id);
        return ResultGenerator.genSuccessResult(thCoinItem);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "0") Integer pageSize) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<ThCoinItem> data = thCoinItemService.findAll();
        PageResult<List<ThCoinItem>> result = new PageResult<>() ;
        result.setResult(data);
        result.setPageNum(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setTotal(page.getTotal());
        return ResultGenerator.genSuccessResult(result);
    }
}
