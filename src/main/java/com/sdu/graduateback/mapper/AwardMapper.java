/*
 * Copyright (c) 2020
 * Date:2020/06/18 21:59:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AwardMapper {


    List<Award> getAwards(String personId);

    List<Award> getAwardsByType(String personId,String type);

    Award getAwardById(String id);
    int addAward(Award award);

    int updateAward(Award award);
}
