/*
 * Copyright (c) 2020
 * Date:2020/06/18 20:57:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.mapper;

import com.sdu.graduateback.dto.TranPlan;

public interface TranPlanMapper {

    TranPlan getTranPlanById(String id);
    int addTranPlan(TranPlan tranPlan);

    int deleteTranPaln(TranPlan tranPlan);
    int updateTrainPlan(TranPlan tranPlan);
}
