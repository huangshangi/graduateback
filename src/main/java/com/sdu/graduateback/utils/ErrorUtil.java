/*
 * Copyright (c) 2020
 * Date:2020/06/12 09:53:12
 * Author:huangshangi
 * explain:用于生成错误报告
 *
 */

package com.sdu.graduateback.utils;

import com.sdu.graduateback.dto.Error;
import com.sdu.graduateback.dto.Result;

public class ErrorUtil {

    public static Result getErrorReport(String reason){


        return new Result("fail",reason,null);
    }
}
