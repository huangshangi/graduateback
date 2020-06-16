package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Ceshi;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.User;
import com.sdu.graduateback.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ceshiController {


    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/c",method = RequestMethod.POST)
    @ResponseBody
    public User ceshi(@RequestBody User user){

        User user1=userMapper.login(user.getU(),user.getP());


        return user1;
    }

}
