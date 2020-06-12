/*
 * Copyright (c) 2020
 * Date:2020/06/12 11:11:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.Teacher;
import com.sdu.graduateback.service.TeacherService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TeacherController {

    UserService userService;

    TeacherService teacherService;

    @RequestMapping(value = "/tinfo")
    @ResponseBody
    public Result checkInfos(@RequestBody Teacher teacher){
        teacher.setId(userService.getIdByToken(teacher.getToken()));

        if(StringUtil.teacherSelect(teacher)){

            //查询教师信息
            Teacher t=teacherService.getTeacherById(teacher.getId());

            //组装


        }else{

            //更新教师信息
            int result=teacherService.updateTeacher(teacher.getId());
            //信息组装

        }


        return null;
    }
}
