/*
 * Copyright (c) 2020
 * Date:2020/06/12 11:11:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.RecuritQualification;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.Teacher;
import com.sdu.graduateback.service.TeacherService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class TeacherController {

    UserService userService;

    TeacherService teacherService;

    @RequestMapping(value = "/tinfo",method = RequestMethod.POST)
    @ResponseBody
    public Result checkInfos(@RequestBody Teacher teacher){
        Map<String,Object> map=new HashMap<>();
        teacher.setId(userService.getIdByToken(teacher.getToken()));
        Teacher obj=teacherService.getTeacherById(teacher.getId());
        if(StringUtil.teacherSelect(teacher)){

            //查询教师信息
            if(obj==null)
                return ErrorUtil.getErrorReport("查询教师数据失败");


            //组装
            map.put("result",obj);
            return new Result("success",null,map);

        }else{

            //更新教师信息
            int result=teacherService.updateTeacher(teacherService.teacherPack(teacher,obj),teacher.getId());
            //信息组装
            if(result==1){
                map.put("result","更新成功");
                return new Result("success",null,map);
            }else{
                return ErrorUtil.getErrorReport("更新教师信息error");
            }

        }



    }



}
