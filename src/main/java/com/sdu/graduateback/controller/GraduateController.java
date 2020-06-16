/*
 * Copyright (c) 2020
 * Date:2020/06/16 12:57:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Graduate;
import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.Thesis;
import com.sdu.graduateback.service.GraduateService;
import com.sdu.graduateback.service.ThesisService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GraduateController {

    UserService userService;

    ThesisService thesisService;

    GraduateService graduateService;

    @RequestMapping(value = "/gradeval",method = RequestMethod.POST)
    @ResponseBody
    public Result gradeval(@RequestBody Graduate graduate){

        String token=graduate.getToken();
        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("参数错误");

        String teacherId=userService.getIdByToken(token);

        if(StringUtil.graduateSelect(graduate)){
            //查询
            List<Thesis> list=thesisService.getThesisByTeacherId(teacherId);

            //进行数据组装 未实现
            thesisService.thesisPack(list);

            return null;
        }else{

            graduateService.updateGraduateByType(graduate.getT(),graduate.getO());

            return null;
        }



    }
}
