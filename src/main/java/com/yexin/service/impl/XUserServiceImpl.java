package com.yexin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yexin.pojo.XUser;
import com.yexin.service.XUserService;
import com.yexin.mapper.XUserMapper;
import org.springframework.stereotype.Service;

/**
* @author kgy
* @description 针对表【x_user】的数据库操作Service实现
* @createDate 2024-03-25 10:49:22
*/
@Service
public class XUserServiceImpl extends ServiceImpl<XUserMapper, XUser>
    implements XUserService{

}




