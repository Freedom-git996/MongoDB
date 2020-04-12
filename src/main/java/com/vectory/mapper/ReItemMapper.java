package com.vectory.mapper;

import com.vectory.model.ReItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ReItemMapper {

    int deleteByPrimaryKey(int id);

    int insert(ReItem record);

    ReItem selectByPrimaryKey(int id);

    List<ReItem> selectAll();

    int updateByPrimaryKey(ReItem record);
}