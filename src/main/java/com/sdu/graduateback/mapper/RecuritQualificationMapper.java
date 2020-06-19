/*
 * Copyright (c) 2020
 * Date:2020/06/12 12:07:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.RecuritQualification;

public interface RecuritQualificationMapper {

    RecuritQualification getById(String id);

    int updateRecuritQualification(RecuritQualification recuritQualification);

    int deleApply(String tid);

    int addApply(String tid);

}
