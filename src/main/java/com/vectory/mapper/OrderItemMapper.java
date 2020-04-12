package com.vectory.mapper;

import com.vectory.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface OrderItemMapper {

    int deleteByPrimaryKey(String id);

    int insert(OrderItem record);

    OrderItem selectByPrimaryKey(String id);

    OrderItem selectByPrimaryOrderKey(String orderId);

    List<OrderItem> selectAll();

    int updateByPrimaryKey(OrderItem record);
}