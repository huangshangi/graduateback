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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import java.util.HashMap;

@Controller
public class TeamController {
    @Autowired
    UserService userService;
    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/recuritteam",method = RequestMethod.POST)
    @ResponseBody
    public Result recuritteam(@RequestBody Team team){
        String token=team.getToken();

        if(StringUtil.isEmpty(token))
            return ErrorUtil.getErrorReport("参数错误");

        String userId=userService.getIdByToken(token);

        HashMap<Object,Object>map=new HashMap<>();
        Team t=teamService.getTeamById(userId);



        if(StringUtil.teamSelect(team)){
            //查询操作
            Object obj=teamService.convertToTeam(t);
            map.put("result",obj);
            //待实现
            return new Result("success",null,map);
        }else{

            //更新操作
            if(StringUtils.isEmpty(team.getType())&&StringUtils.isEmpty(team.getPersonId()))
                team=teamService.executeApply(team,team.getType(),team.getPersonId());


            Team obj=teamService.teamPack(team,t);

            if(teamService.updateTeam(obj)!=0)
                return new Result("success",null,null);
            else
                return ErrorUtil.getErrorReport("更新信息失败");
        }



    }



}
