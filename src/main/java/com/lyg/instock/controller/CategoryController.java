package com.lyg.instock.controller;

import com.lyg.instock.domain.Category;
import com.lyg.instock.service.CategoryService;
import com.lyg.instock.utils.CommonResponse;
import com.lyg.instock.utils.ResultBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:分类
 * @author: lyg.liu
 * @date: 2021/4/16 18:31
 */
@Api(tags = "分类管理")
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @ApiOperation("获取所有分类")
    @GetMapping("/getCategorys")
    public CommonResponse<List<Category>> getCategory() {
        return ResultBuilder.buildSuccessResult(categoryService.list());
    }
    @ApiOperation("获取分类")
    @GetMapping("/getCategory")
    public CommonResponse<Category> getCategoryById(Integer id) {
        return ResultBuilder.buildSuccessResult(categoryService.getById(id));
    }

    @ApiOperation("更新分类")
    @PostMapping("/updateCategory")
    public CommonResponse<Boolean> updateCategory(@RequestBody Category Category) {
        return ResultBuilder.buildSuccessResult(categoryService.updateById(Category));
    }

    @ApiOperation("新增分类")
    @PostMapping("/insertCategory")
    public CommonResponse<Boolean> insertCategory(@RequestBody Category Category) {
        return ResultBuilder.buildSuccessResult(categoryService.save(Category));
    }

    @ApiOperation("删除分类")
    @PostMapping("/deleteCategory")
    public CommonResponse<Boolean> deleteCategoryById(Integer id) {
        return ResultBuilder.buildSuccessResult(categoryService.removeById(id));
    }

}
