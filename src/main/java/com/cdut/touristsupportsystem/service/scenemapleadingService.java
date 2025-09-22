package com.cdut.touristsupportsystem.service;

import com.cdut.touristsupportsystem.entity.scenemapleading;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 马畅
* @description 针对表【scenemapleading】的数据库操作Service
* @createDate 2025-09-15 13:09:04
*/
public interface scenemapleadingService extends IService<scenemapleading> {

    List<scenemapleading> getAllAddresses();
}
