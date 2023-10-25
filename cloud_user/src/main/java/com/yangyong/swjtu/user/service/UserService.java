package com.yangyong.swjtu.user.service;

import com.yangyong.swjtu.user.mapper.UserMapper;
import com.yangyong.swjtu.user.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yangyong
 * 2023-10-25 11:06
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(@Param("id") Long id){
        return userMapper.findById(id);
    }
}
