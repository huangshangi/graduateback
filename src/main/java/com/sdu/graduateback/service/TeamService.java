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

    int addMember(String tid,String id);

    int deleMember(String tid,String id);

    Team getTeamById(String id);

    Team teamPack(Team oldT,Team newT);
}
