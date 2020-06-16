/*
 * Copyright (c) 2020
 * Date:2020/06/12 08:36:12
 * Author:huangshangi
 * explain:用户个人信息实体
 *
 */

package com.sdu.graduateback.dto;

//import jdk.nashorn.internal.objects.annotations.Getter;


public class User {
    private String user_id;

    private String user_type;

    private String u;//用户名

    private String p;//用户密码

    private String openid;//该用户持有的openid,用于微信唯一标识用户

    private String token;//唯一标识用户 用于单点登录

    private String code;//数据库中不应存储该字段


    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String toString(){
        return p+" "+u;
    }
}
