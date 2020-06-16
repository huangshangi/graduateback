/*
 * Copyright (c) 2020
 * Date:2020/06/12 10:45:12
 * Author:huangshangi
 * explain:进行网络请求时返回值格式
 *
 */

package com.sdu.graduateback.dto;

public class Result {

    private String status;

    private String reason;

    private Object result;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Result(){

    }



    public Result(String status, String reason, Object result) {
        this.status = status;
        this.reason = reason;
        this.result = result;
    }
}
