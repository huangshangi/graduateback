/*
 * Copyright (c) 2020
 * Date:2020/06/15 14:45:15
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.controller;

import com.sdu.graduateback.dto.Result;
import com.sdu.graduateback.dto.Team;
import com.sdu.graduateback.service.TeamService;
import com.sdu.graduateback.service.UserService;
import com.sdu.graduateback.utils.ErrorUtil;
import com.sdu.graduateback.utils.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeamController {

    UserService userService;

    TeamService teamService;

    @RequestMapping(value = "/recuritteam",method = RequestMethod.POST)
    @ResponseBody
    public Result recuritteam(@RequestBody Team team){
        String token=team.getToken();

        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("参数错误");


        return null;

    }



}
