package com.lyg.instock.controller;

import com.lyg.instock.domain.Sku;

import com.lyg.instock.service.SkuService;

import com.lyg.instock.utils.CommonResponse;
import com.lyg.instock.utils.ResultBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: lyg.liu
 * @date: 2021/4/16 15:05
 */
@Api(tags = "sku管理")
@RestController
@RequestMapping("/sku")
public class SkuController {
    @Autowired
    private SkuService skuService;
    @ApiOperation("获取所有skus")
    @GetMapping("/getSkus")
    public CommonResponse<List<Sku>> getSku() {
        return ResultBuilder.buildSuccessResult(skuService.list());
    }
    @ApiOperation("获取sku")
    @GetMapping("/getSku")
    public CommonResponse<Sku> getSkuById(Integer id) {
        return ResultBuilder.buildSuccessResult(skuService.getById(id));
    }

    @ApiOperation("更新sku")
    @PostMapping("/updateSku")
    public CommonResponse<Boolean> updateSku(@RequestBody Sku Sku) {
        return ResultBuilder.buildSuccessResult(skuService.updateById(Sku));
    }

    @ApiOperation("新增sku")
    @PostMapping("/insertSku")
    public CommonResponse<Boolean> insertSku(@RequestBody Sku Sku) {
        return ResultBuilder.buildSuccessResult(skuService.save(Sku));
    }

    @ApiOperation("删除sku")
    @PostMapping("/deleteSku")
    public CommonResponse<Boolean> deleteSkuById(Integer id) {
        return ResultBuilder.buildSuccessResult(skuService.removeById(id));
    }


}
