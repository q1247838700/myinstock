package com.lyg.instock.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyg.instock.domain.Order;
import com.lyg.instock.service.OrderService;
import com.lyg.instock.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
implements OrderService{

}




