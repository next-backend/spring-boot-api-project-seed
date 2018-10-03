package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.PageResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ThCoinFreezeItem;
import com.company.project.service.ThCoinFreezeItemService;
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
@RequestMapping("/th/coin/freeze/item")
public class ThCoinFreezeItemController {
    @Resource
    private ThCoinFreezeItemService thCoinFreezeItemService;

    @PostMapping("/add")
    public Result add(ThCoinFreezeItem thCoinFreezeItem) {
        thCoinFreezeItemService.save(thCoinFreezeItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Long id) {
        thCoinFreezeItemService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ThCoinFreezeItem thCoinFreezeItem) {
        thCoinFreezeItemService.update(thCoinFreezeItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        ThCoinFreezeItem thCoinFreezeItem = thCoinFreezeItemService.findById(id);
        return ResultGenerator.genSuccessResult(thCoinFreezeItem);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "0") Integer pageSize) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<ThCoinFreezeItem> data = thCoinFreezeItemService.findAll();
        PageResult<List<ThCoinFreezeItem>> result = new PageResult<>() ;
        result.setResult(data);
        result.setPageNum(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setTotal(page.getTotal());
        return ResultGenerator.genSuccessResult(result);
    }
}
