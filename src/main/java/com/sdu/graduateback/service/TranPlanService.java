/*
 * Copyright (c) 2020
 * Date:2020/06/16 15:11:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.TranPlan;

public interface TranPlanService {

    int addTranPlan(TranPlan tranPlan);

    int deleteTranPaln(TranPlan tranPlan);

    TranPlan getTranPlanById(String id);


}
