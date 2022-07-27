package com.example.demo.study.service.impl;

import com.example.demo.study.pojo.Count;
import com.example.demo.study.mapper.CountMapper;
import com.example.demo.study.service.CountService;
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
public class CountServiceImpl extends ServiceImpl<CountMapper, Count> implements CountService {

}
