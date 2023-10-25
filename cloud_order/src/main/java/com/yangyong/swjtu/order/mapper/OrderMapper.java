package com.yangyong.swjtu.order.mapper;

import com.yangyong.swjtu.order.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Yangyong
 * 2023-10-25 10:55
 */
public interface OrderMapper {
    @Select("select * from tb_order where id = #{id}")
    Order findById(@Param("id") Long id);
}
