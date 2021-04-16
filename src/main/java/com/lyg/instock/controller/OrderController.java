package com.lyg.instock.controller;

import com.lyg.instock.domain.Order;
import com.lyg.instock.service.OrderService;
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
 * @date: 2021/4/16 18:42
 */
@Api(tags = "订单")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @ApiOperation("获取所有订单")
    @GetMapping("/getOrders")
    public CommonResponse<List<Order>> getOrders() {
        return ResultBuilder.buildSuccessResult(orderService.list());
    }


    @ApiOperation("获取订单根据id")
    @GetMapping("/getOrder")
    public CommonResponse<Order> getOrderById(Integer id) {
        return ResultBuilder.buildSuccessResult(orderService.getById(id));
    }


    @ApiOperation("更新订单")
    @PostMapping("/updateOrder")
    public CommonResponse<Boolean> updateOrder(@RequestBody Order order) {
        return ResultBuilder.buildSuccessResult(orderService.updateById(order));
    }


    @ApiOperation("新加订单")
    @PostMapping("/insertOrder")
    public CommonResponse<Boolean> insertOrder(@RequestBody Order order) {
        return ResultBuilder.buildSuccessResult(orderService.save(order));
    }


    @ApiOperation("删除订单通过id")
    @PostMapping("/deleteOrder")
    public CommonResponse<Boolean> deleteOrderById(Integer id) {
        return ResultBuilder.buildSuccessResult(orderService.removeById(id));
    }
}
