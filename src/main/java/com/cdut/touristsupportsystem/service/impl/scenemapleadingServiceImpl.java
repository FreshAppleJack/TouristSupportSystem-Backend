package com.cdut.touristsupportsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cdut.touristsupportsystem.entity.scenemapleading;
import com.cdut.touristsupportsystem.service.scenemapleadingService;
import com.cdut.touristsupportsystem.mapper.scenemapleadingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 马畅
* @description 针对表【scenemapleading】的数据库操作Service实现
* @createDate 2025-09-15 13:09:04
*/


@Service
public class scenemapleadingServiceImpl extends ServiceImpl<scenemapleadingMapper, scenemapleading>
    implements scenemapleadingService{

    @Autowired
    scenemapleadingMapper scenemapleadingMapper;

    @Override
    public List<scenemapleading> getAllAddresses() {
        return scenemapleadingMapper.getAllAddresses();
    }
}




