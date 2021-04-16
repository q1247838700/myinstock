package com.lyg.instock.controller;

import com.lyg.instock.domain.Goods;
import com.lyg.instock.service.GoodsService;
import com.lyg.instock.utils.CommonResponse;
import com.lyg.instock.utils.ResultBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 物品
 * @author: lyg.liu
 * @date: 2021/4/16 18:40
 */
@Api(tags = "物品")
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;


    @ApiOperation("获取所有物品")
    @GetMapping("/getGoodss")
    public CommonResponse<List<Goods>> getGoodss() {
        return ResultBuilder.buildSuccessResult(goodsService.list());
    }


    @ApiOperation("获取物品根据id")
    @GetMapping("/getGoods")
    public CommonResponse<Goods> getGoodsById(Integer id) {
        return ResultBuilder.buildSuccessResult(goodsService.getById(id));
    }


    @ApiOperation("更新物品")
    @PostMapping("/updateGoods")
    public CommonResponse<Boolean> updateGoods(@RequestBody Goods goods) {
        return ResultBuilder.buildSuccessResult(goodsService.updateById(goods));
    }


    @ApiOperation("新加物品")
    @PostMapping("/insertGoods")
    public CommonResponse<Boolean> insertGoods(@RequestBody Goods goods) {
        return ResultBuilder.buildSuccessResult(goodsService.save(goods));
    }


    @ApiOperation("删除物品通过id")
    @PostMapping("/deleteGoods")
    public CommonResponse<Boolean> deleteGoodsById(Integer id) {
        return ResultBuilder.buildSuccessResult(goodsService.removeById(id));
    }
}
