/*
 * Copyright (c) 2020
 * Date:2020/06/16 14:48:16
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.dto;

public class GoAbroad {

    String id;

    String title;
    String reson;
    String time;

    //以下字段不应再数据库中储存
    String type;//出国类型 公派  国际会议 出国申请 归国变更
    String status;//出国审核状态

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
