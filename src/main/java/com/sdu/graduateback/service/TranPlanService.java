/*
 * Copyright (c) 2020
 * Date:2020/06/16 15:11:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.TranPlan;

import java.util.List;

public interface TranPlanService {

    int addTranPlan(TranPlan tranPlan);

    int deleteTranPaln(TranPlan tranPlan);

    TranPlan getTranPlanById(String id);

    List<TranPlan> getTranPlans(String teacherId);

    Object convertTranPlanToJson(List<TranPlan>list);


}
