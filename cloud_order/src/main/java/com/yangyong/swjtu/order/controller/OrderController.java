package com.yangyong.swjtu.order.controller;

import com.yangyong.swjtu.order.pojo.Order;
import com.yangyong.swjtu.order.pojo.User;
import com.yangyong.swjtu.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Yangyong
 * 2023-10-25 10:58
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("{orderId}")
    public Order getOrderById(@PathVariable("orderId") Long orderId){
        return orderService.getOrderById(orderId);
    }
}
