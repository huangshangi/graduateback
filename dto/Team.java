/*
 * Copyright (c) 2020
 * Date:2020/06/15 14:18:15
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.dto;

public class Team {



    int id;//管理者工号

    String ti;//团队介绍

    String tn;//团队名称

    String tml;//团队成员列表

    //下列字段不该储存在数据库中
    String token;

    String type;

    String personId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTi() {
        return ti;
    }

    public void setTi(String ti) {
        this.ti = ti;
    }

    public String getTn() {
        return tn;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }

    public String getTml() {
        return tml;
    }

    public void setTml(String tml) {
        this.tml = tml;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
