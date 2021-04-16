package com.lyg.instock.controller;

import com.lyg.instock.domain.Spu;
import com.lyg.instock.service.SpuService;
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
 * @date: 2021/4/16 16:17
 */
@Api(tags = "SPU管理")
@RestController
@RequestMapping("/spu")
public class SpuController {
    @Autowired
    private SpuService spuService;
    @ApiOperation("获取所有spu")
    @GetMapping("/getSpus")
    public CommonResponse<List<Spu>> getSpu() {
        return ResultBuilder.buildSuccessResult(spuService.list());
    }
    @ApiOperation("获取spu")
    @GetMapping("/getSpu")
    public CommonResponse<Spu> getSpuById(Integer id) {
        return ResultBuilder.buildSuccessResult(spuService.getById(id));
    }

    @ApiOperation("更新spu")
    @PostMapping("/updateSpu")
    public CommonResponse<Boolean> updateSpu(@RequestBody Spu Spu) {
        return ResultBuilder.buildSuccessResult(spuService.updateById(Spu));
    }

    @ApiOperation("新增spu")
    @PostMapping("/insertSpu")
    public CommonResponse<Boolean> insertSpu(@RequestBody Spu Spu) {
        return ResultBuilder.buildSuccessResult(spuService.save(Spu));
    }

    @ApiOperation("删除spu")
    @PostMapping("/deleteSpu")
    public CommonResponse<Boolean> deleteSpuById(Integer id) {
        return ResultBuilder.buildSuccessResult(spuService.removeById(id));
    }
}
