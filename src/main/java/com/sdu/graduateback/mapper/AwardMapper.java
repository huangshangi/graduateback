/*
 * Copyright (c) 2020
 * Date:2020/06/18 21:59:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Award;

import java.util.List;

public interface AwardMapper {


    List<Award> getAwards(String personId);
    int addAward(Award award);

    Award getAwardById(String id);


    int updateAward(Award award);
}
