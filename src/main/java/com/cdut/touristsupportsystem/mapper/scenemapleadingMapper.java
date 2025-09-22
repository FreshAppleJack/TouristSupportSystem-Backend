package com.cdut.touristsupportsystem.mapper;

import com.cdut.touristsupportsystem.entity.scenemapleading;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 马畅
* @description 针对表【scenemapleading】的数据库操作Mapper
* @createDate 2025-09-15 13:09:04
* @Entity com.cdut.touristsupportsystem.entity.scenemapleading
*/
public interface scenemapleadingMapper extends BaseMapper<scenemapleading> {

    List<scenemapleading> getAllAddresses();
}




