/*
 * Copyright (c) 2020
 * Date:2020/06/16 15:09:16
 * Author:huangshangi
 * explain:该类应在数据库中储存
 *
 */

package com.sdu.graduateback.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

//信息待完善
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TranPlan {

    String i;//学生学号

    String name;//姓名 无意义字符
    String plan;
    String status;//审核状态


    String token;

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "TranPlan{" +
                "i='" + i + '\'' +
                ", name='" + name + '\'' +
                ", plan='" + plan + '\'' +
                ", status='" + status + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
