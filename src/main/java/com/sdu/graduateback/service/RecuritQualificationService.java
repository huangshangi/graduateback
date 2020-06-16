/*
 * Copyright (c) 2020
 * Date:2020/06/12 12:07:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.RecuritQualification;

public interface RecuritQualificationService {


    RecuritQualification getById(String id);


    String getIdByToken(String id);


    Object convertJson(RecuritQualification recuritQualification);

    RecuritQualification  recuritQualificationPack(RecuritQualification oldR,RecuritQualification newR);

    int updateRecuritQualificationById(RecuritQualification recuritQualification,String id);

    int deleApply(String tid);

    int addApply(String tid);

    int executeApply(String type,String tid);
}
