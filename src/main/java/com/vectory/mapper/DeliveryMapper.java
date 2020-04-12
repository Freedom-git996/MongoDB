package com.vectory.mapper;

import com.vectory.model.Delivery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeliveryMapper {

    int deleteByPrimaryKey(Integer id);
    int deleteByDeliveryName(String deliveryName);

    int insert(Delivery record);

    Delivery selectByPrimaryKey(Integer id);

    List<Delivery> selectAll();

    int updateByPrimaryKey(Delivery record);

    Delivery selectByName(String name);
}