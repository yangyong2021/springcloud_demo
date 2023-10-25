package com.yangyong.swjtu.order.controller;

import com.yangyong.swjtu.order.pojo.Order;
import com.yangyong.swjtu.order.pojo.User;
import com.yangyong.swjtu.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{orderId}")
    public Order getOrderById(@PathVariable("orderId") Long orderId){
        Order order = orderService.getOrderById(orderId);

        String url = "http://127.0.0.1:8083/user/"+ order.getUserId();

        User user = restTemplate.getForObject(url, User.class);

        order.setUser(user);
        return order;
    }
}
