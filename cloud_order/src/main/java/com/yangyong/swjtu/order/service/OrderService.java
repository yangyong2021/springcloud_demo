package com.yangyong.swjtu.order.service;

import com.yangyong.swjtu.order.mapper.OrderMapper;
import com.yangyong.swjtu.order.pojo.Order;
import com.yangyong.swjtu.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yangyong
 * 2023-10-25 10:57
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    public Order getOrderById(Long id) {
        Order order = orderMapper.findById(id);
//        String url = "http://127.0.0.1:8083/user/"+ order.getUserId();
        String url = "http://userservice/user/" + order.getUserId();
        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        return order;
    }
}
