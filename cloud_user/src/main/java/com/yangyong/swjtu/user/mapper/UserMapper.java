package com.yangyong.swjtu.user.mapper;

import com.yangyong.swjtu.user.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author Yangyong
 * 2023-10-25 11:05
 */
public interface UserMapper {

    @Select("select * from tb_user where id =#{id}")
    User findById(Long id);
}
