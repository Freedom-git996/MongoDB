package com.vectory.mapper;

import com.vectory.model.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jiangyunxiong on 2018/3/10.
 */
@Mapper
@Component
public interface ItemMapper {

    Item findById(Item item);

    void delete(Item item);

    List<Item> list(Item item);

    List<Item> listS(Item item);

    int count(Item item);

    int insert(Item item);

    int update (Item item);


    List<Item> selectAll();
}
