/*
 * Copyright (c) 2020
 * Date:2020/06/12 09:03:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sdu.graduateback.dto.Ceshi;
import com.sdu.graduateback.dto.Error;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.User;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.EncryptUtil;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.HttpUtils;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    UserService userService;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody User user){

        String name=user.getU();
        String pass=user.getP();
        String openid=user.getOpenid();
        String code=user.getCode();
        String token=user.getToken();
        Map<String,String>hashMap=new HashMap<>();

        int result=0;

        if(!StringUtil.isEmpty(name)&&!StringUtil.isEmpty(pass)){
            //未绑定账号登录过程

            if((result=userService.verifyUser(name,pass))==0)
                //登录失败
                return ErrorUtil.getErrorReport("用户名或密码错误");
            else{
                //登录成功生成token
                String t=EncryptUtil.generateToken(name);

                //存入数据库
                userService.updateToken(t,name);

                hashMap.put("token",t);
                return new Result("success",null,hashMap);
            }

        }else if(!StringUtil.isEmpty(code)){
            //使用code请求openid
            openid=HttpUtils.getOpenId(code);

            //return new Result("success",null,t);
        }else if(!StringUtil.isEmpty(openid)){
            token=userService.getTokenByOpenid(openid);
            hashMap.put("token",token);
            return new Result("success",null,hashMap);
        }



        return ErrorUtil.getErrorReport("传入参数的有误");
    }


    @RequestMapping(value = "/c",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Result ceshi(@RequestBody Ceshi ceshi){
        Result result=new Result();
        String s="dd";
        result.setResult(s);
        return result;
    }


}
