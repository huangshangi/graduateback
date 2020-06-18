/*
 * Copyright (c) 2020
 * Date:2020/06/18 16:55:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service.impl;

import com.sdu.graduateback.dto.Teacher;
import com.sdu.graduateback.dto.Team;
import com.sdu.graduateback.mapper.TeacherMapper;
import com.sdu.graduateback.mapper.TeamMapper;
import com.sdu.graduateback.mapper.UserMapper;
import com.sdu.graduateback.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamMapper teamMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public int addTeam(Team team) {
        return 0;
    }

    @Override
    public int deleteTeam(Team team) {
        return 0;
    }

    @Override
    public int updateTeam(Team team) {
        return teamMapper.updateTeam(team);
    }

    @Override
    public int addMember(String tid, String id) {
        return 0;
    }

    @Override
    public int deleMember(String tid, String id) {
        return 0;
    }

    @Override
    public Team getTeamById(String id) {
        return teamMapper.getTeamById(id);
    }

    @Override
    public Team teamPack(Team oldT, Team newT) {
        if(StringUtils.isEmpty(oldT.getTn()))
            newT.setTn(oldT.getTn());

        if(StringUtils.isEmpty(oldT.getTi()))
            newT.setTi(oldT.getTi());

        if(StringUtils.isEmpty(oldT.getTml()))
            newT.setTml(oldT.getTml());

        return newT;
    }

    @Override
    public Object convertToTeam(Team team) {
        Map<String,Object> map=new HashMap<>();

        Map<String,String>tai=new HashMap<>();

        tai.put("tn",team.getTn());
        tai.put("ta",teacherMapper.getTeacherById(team.getId()).getName());
        tai.put("u",teacherMapper.getTeacherById(team.getId()).getUnit());
        tai.put("ti",team.getTi());

        List<Teacher> tml=new ArrayList<>();

        String[] array=team.getTml().split(",");

        for(String s:array)
            tml.add(teacherMapper.getTeacherById(s));

        map.put("tai",tai);
        map.put("tml",tml);
        return map;
    }

    @Override
    public Team executeApply(Team team, String type, String personId) {
        String tml=team.getTml();
        if(type.equals("0"))
            tml=deleteString(tml,personId);
        else
            tml+=","+personId;

        team.setTml(tml);

        return team;
    }

    String deleteString(String str,String dele){

        String array[]=str.split(",");

        StringBuilder res=new StringBuilder();
        for(String s:array)
            if(!s.equals(dele))
                res.append(s+",");


        return res.toString().substring(0,res.toString().length()-1);
    }
}
