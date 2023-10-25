package com.yangyong.swjtu.order.service;

import com.yangyong.swjtu.order.mapper.OrderMapper;
import com.yangyong.swjtu.order.pojo.Order;
import com.yangyong.swjtu.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yangyong
 * 2023-10-25 10:57
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public Order getOrderById(Long id) {
        return orderMapper.findById(id);
    }
}
