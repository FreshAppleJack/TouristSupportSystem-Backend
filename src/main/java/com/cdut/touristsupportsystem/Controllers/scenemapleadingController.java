package com.cdut.touristsupportsystem.Controllers;

import com.cdut.touristsupportsystem.entity.scenemapleading;
import com.cdut.touristsupportsystem.service.scenemapleadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("scenemapleading")
public class scenemapleadingController {
    @Autowired
    scenemapleadingService scenemapleadingService;

    @RequestMapping("getAllAddresses")
    public List<scenemapleading> getAllAddresses() {
        return scenemapleadingService.getAllAddresses();
    }
}
