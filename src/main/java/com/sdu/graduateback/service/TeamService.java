/*
 * Copyright (c) 2020
 * Date:2020/06/15 14:28:15
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Team;

public interface TeamService {

    int addTeam(Team team);

    int deleteTeam(Team team);

    int updateTeam(Team team);

    int addMember(String tid,String id);//tid为唯一标识，id为原来的member+","+新的成员的id，我直接换成了updateMember方法，你把处理后的member传过去就可以了

    int deleMember(String tid,String id);

    Team getTeamById(String id);

    Team teamPack(Team oldT,Team newT);

    Object convertToTeam(Team team);

    Team executeApply(Team team,String type,String personId);

}
