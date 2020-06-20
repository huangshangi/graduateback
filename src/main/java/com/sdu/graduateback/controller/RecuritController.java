/*
 * Copyright (c) 2020
 * Date:2020/06/15 13:13:15
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.RecuritQualification;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.service.RecuritQualificationService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RecuritController {
    @Autowired
    RecuritQualificationService recuritQualificationService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/recurit",method = RequestMethod.POST)
    @ResponseBody
    public Result recurit(@RequestBody RecuritQualification obj){

        if(StringUtil.isEmpty(obj.getToken()))
            return ErrorUtil.getErrorReport("参数有误");

        String id=userService.getIdByToken(obj.getToken());

        RecuritQualification newObj=recuritQualificationService.getById(id);

        if(newObj==null)
            return ErrorUtil.getErrorReport("参数有误");

        Map<String,Object> map=new HashMap<>();

        if(StringUtil.recuritQualiSelect(obj)){
            //查询操作
            Object object=recuritQualificationService.convertJson(newObj);
            map.put("result",object);
            return new Result("success",null,object);
        }else{
            //更新操作
            RecuritQualification newR=recuritQualificationService.recuritQualificationPack(obj,newObj);

            if(!StringUtil.isEmpty(obj.getT())){
                String type=obj.getT();
                String tId=obj.gettId();
                newR=recuritQualificationService.executeApply(newR,type,tId);

            }


            if(recuritQualificationService.updateRecuritQualification(newR)!=1)
                return ErrorUtil.getErrorReport("更新数据时发生错误");
            else{
                map.put("result","更新数据成功");
                return new Result("success",null,null);
            }
        }

    }
}
