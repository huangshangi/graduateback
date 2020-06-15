/*
 * Copyright (c) 2020
 * Date:2020/06/15 14:18:15
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.dto;

public class Team {



    String id;//管理者工号

    String ti;

    String tn;

    String tml;

    String token;


    public String getId() {
        return id;
    }

    public void setId(String id) {
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
