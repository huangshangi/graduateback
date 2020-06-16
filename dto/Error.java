/*
 * Copyright (c) 2020
 * Date:2020/06/12 09:54:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.dto;

public class Error {

   private String status;

   private String reason;

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

    public Error(String status, String reason) {
        this.status = status;
        this.reason = reason;
    }


}
