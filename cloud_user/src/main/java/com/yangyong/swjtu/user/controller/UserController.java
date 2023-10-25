package com.yangyong.swjtu.user.controller;

import com.yangyong.swjtu.user.pojo.User;
import com.yangyong.swjtu.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yangyong
 * 2023-10-25 11:08
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
}
