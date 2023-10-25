package com.yangyong.swjtu.order.pojo;

import lombok.Data;

/**
 * @author Yangyong
 * 2023-10-25 10:51
 */
@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    private User user;
}
