/*
 * Copyright (c) 2020
 * Date:2020/06/16 14:05:16
 * Author:huangshangi
 * explain:仅用于接收参数  不在数据库中储存
 *
 */

package com.sdu.graduateback.dto;

public class StudentInfo {

    String token;

    String i;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }
}
