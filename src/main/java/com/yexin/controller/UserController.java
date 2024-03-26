package com.yexin.controller;

import com.yexin.pojo.XUser;
import com.yexin.service.XUserService;
import com.yexin.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private XUserService xUserService;

    @GetMapping("/alluser")
    public Result getAllUser(){
        List<XUser> list = xUserService.list();
        return Result.success("查询成功",list);
    }
}
