package com.vectory.mapper;

import com.vectory.model.OrderShipping;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface OrderShippingMapper {

    int deleteByPrimaryKey(String orderId);

    int insert(OrderShipping record);

    OrderShipping selectByPrimaryKey(String orderId);

    List<OrderShipping> selectAll();

    int updateByPrimaryKey(OrderShipping record);
}