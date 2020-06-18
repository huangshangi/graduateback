/*
 * Copyright (c) 2020
 * Date:2020/06/18 16:54:18
 * Author:huangshangi
 * explain:教师招生团队申请
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Team;

public interface TeamMapper {

    Team getTeamById(String id);

    int updateTeam(Team team);
}
