/*
 * Copyright (c) 2020
 * Date:2020/06/12 12:06:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.Recurit;

public interface RecuritService {

    Recurit getRecuritById(String id);


    Recurit getRecuritByScAndSt(String sc,String st);




}
