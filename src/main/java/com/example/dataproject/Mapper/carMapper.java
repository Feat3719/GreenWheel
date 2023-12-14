package com.example.dataproject.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.dataproject.Entity.car;

@Mapper
public interface carMapper {
    List<car> getAllYourEntities();

    @Select("SELECT * FROM users WHERE id = #{id}")
    car getUserById(@Param("id") int id);
}
