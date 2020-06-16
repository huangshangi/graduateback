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
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    UserService userService;

    @RequestMapping(value = "/bind",method = RequestMethod.POST)
    @ResponseBody
    public Result bind(@RequestParam String token,@RequestParam String code){
        HashMap<String,String>map=new HashMap<>();
        if(!StringUtil.isEmpty(token)&&!StringUtil.isEmpty(code)){
            String openId=HttpUtils.getOpenId(code);
            if(userService.updateOpenIdByToken(openId,token)!=1){
                //更新失败
                return ErrorUtil.getErrorReport("绑定失败,请检查登录状态");
            }else{
                map.put("openid",openId);
                return new Result("success",null,map);
            }
        }else{
            return ErrorUtil.getErrorReport("绑定失败,请检查参数");
        }
    }


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
            String t=userService.getTokenByOpenid(openid);
            hashMap.put("token",t);
            return new Result("success",null,hashMap);
            //return new Result("success",null,t);
        }else if(!StringUtil.isEmpty(openid)){
            token=userService.getTokenByOpenid(openid);
            hashMap.put("token",token);
            return new Result("success",null,hashMap);
        }



        return ErrorUtil.getErrorReport("传入参数的有误");
    }





}
