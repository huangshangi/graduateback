/*
 * Copyright (c) 2020
 * Date:2020/06/12 12:07:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.RecuritQualification;
import org.springframework.stereotype.Service;

@Service
public interface RecuritQualificationService {


    RecuritQualification getById(String id);


    String getIdByToken(String id);


    Object convertJson(RecuritQualification recuritQualification);

    RecuritQualification  recuritQualificationPack(RecuritQualification oldR,RecuritQualification newR);

    int updateRecuritQualification(RecuritQualification recuritQualification);

    int deleApply(String tid);

    int addApply(String tid);

    RecuritQualification executeApply(RecuritQualification recuritQualification,String type,String tid);
}
