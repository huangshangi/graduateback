/*
 * Copyright (c) 2020
 * Date:2020/06/12 10:57:12
 * Author:huangshangi
 * explain:
 *
 */

package com.sdu.graduateback.utils;

import com.sdu.graduateback.dto.Http;
import org.springframework.web.client.RestTemplate;

public class HttpUtils {


    public static String getOpenId(String code){
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
        String url="https://api.weixin.qq.com/sns/jscode2session?appid=wx1e53ae3981a71628&" +
                "secret=5fbd22f67d7e94763a9787240ec6ccc7&js_code=" +code+
                "&grant_type=authorization_code";

        Http obj=restTemplate.getForObject(url,Http.class);


        return obj.getOpenid();
    }
}
