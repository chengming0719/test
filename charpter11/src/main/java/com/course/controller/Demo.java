package com.course.controller;

import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "v1", description = "这是我的第一个版本demo")
@RequestMapping("v1")
public class Demo {
    //    首先获得一个执行SQL语句的对象
    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount", method = RequestMethod.GET)
    @ApiOperation(value = "可以获取用户数", httpMethod = "GET")
    public int getUserCount(){ return template.selectOne("getUserCount"); }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ApiOperation(value = "获取插入的用户数", httpMethod = "POST")
    public int addUser(@RequestBody User user){
        return template.insert("addUser", user);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public int updateUser(@RequestBody User user){
        return template.update("updateUser", user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public int delUser(@RequestParam int id){
        return template.delete("deleteUser", id);
    }

}