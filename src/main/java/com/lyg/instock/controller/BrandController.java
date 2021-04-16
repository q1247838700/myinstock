package com.lyg.instock.controller;

import com.lyg.instock.domain.Brand;
import com.lyg.instock.service.BrandService;
import com.lyg.instock.utils.CommonResponse;
import com.lyg.instock.utils.ResultBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: lyg.liu
 * @date: 2021/4/16 16:09
 */
@Api(tags = "品牌管理")
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;


    @ApiOperation("获取所有品牌")
    @GetMapping("/getBrands")
    public CommonResponse<List<Brand>> getBrands() {
        return ResultBuilder.buildSuccessResult(brandService.list());
    }


    @ApiOperation("获取品牌根据id")
    @GetMapping("/getBrand")
    public CommonResponse<Brand> getBrandById(Integer id) {
        return ResultBuilder.buildSuccessResult(brandService.getById(id));
    }


    @ApiOperation("更新品牌")
    @PostMapping("/updateBrand")
    public CommonResponse<Boolean> updateBrand(@RequestBody Brand brand) {
        return ResultBuilder.buildSuccessResult(brandService.updateById(brand));
    }


    @ApiOperation("新加品牌")
    @PostMapping("/insertBrand")
    public CommonResponse<Boolean> insertBrand(@RequestBody Brand brand) {
        return ResultBuilder.buildSuccessResult(brandService.save(brand));
    }


    @ApiOperation("删除品牌通过id")
    @PostMapping("/deleteBrand")
    public CommonResponse<Boolean> deleteBrandById(Integer id) {
        return ResultBuilder.buildSuccessResult(brandService.removeById(id));
    }

}
