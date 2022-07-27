package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.tools.numberTool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Random;

@SpringBootTest
class MybatisPlusApplicationTests {
    //继承了BaseMapper，所有的方法都来自父类，我们也可以编写自己的扩展方法！
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        //参数是一个wrapper ，条件构造器，这里我们先不用 null
        List<User> userList = userMapper.selectList(null);//查询全部的用户
        userList.forEach(System.out::println);
    }
    @Test//测试插入
    public void insertTest(){
        for (int i = 0; i <50; i++) {
            User user = new User();
            String name=new numberTool().getRandomString(4);
            user.setName(name);
            Random random=new Random();
            int age=random.nextInt(100);
            int email=random.nextInt(1000000);
            user.setAge(age);
            String emailaddress=email+"@qq.com";
            user.setEmail(emailaddress);
            Integer result = userMapper.insert(user); //会帮我们自动生成id
            System.out.println(result); //受影响的行数
            System.out.println(user); //通过日志发现id会自动回填
        }

    }
}