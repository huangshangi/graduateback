/*
 * Copyright (c) 2020
 * Date:2020/06/18 19:58:18
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.service;

import com.sdu.graduateback.dto.GoAbroad;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface GoAbroadService {

    List<GoAbroad>getGoAbroads(String type,String teacherId);

    Object convertGoAbroadJson(List<GoAbroad>list);


}
