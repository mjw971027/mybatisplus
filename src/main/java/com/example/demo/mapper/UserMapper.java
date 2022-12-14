package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;
//在对应的接口上面继承一个基本的接口 BaseMapper
@Repository//代表持久层
public interface UserMapper extends BaseMapper<User> {
    //所有CRUD操作都编写完成了，不用像以前一样配置一大堆文件
}