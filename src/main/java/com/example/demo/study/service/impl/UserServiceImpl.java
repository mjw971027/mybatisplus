package com.example.demo.study.service.impl;

import com.example.demo.study.pojo.User;
import com.example.demo.study.mapper.UserMapper;
import com.example.demo.study.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wsk
 * @since 2022-07-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
