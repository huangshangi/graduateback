/*
 * Copyright (c) 2020
 * Date:2020/06/12 10:33:12
 * Author:huangshangi
 * explain:用于加密操作
 *
 */

package com.sdu.graduateback.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class EncryptUtil {


    //生成token
    public static String generateToken(String id) {
        try{
            String content=id+new Date().getTime();
            String encryptKey="nishinonanasekon";
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));
            byte[] b = cipher.doFinal(content.getBytes("utf-8"));
            return Base64.encodeBase64String(b);
        }catch (Exception e){
            e.printStackTrace();
        }

        return id;
    }
}
