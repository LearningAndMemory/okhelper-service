package com.ok.okhelper.until;

import com.ok.okhelper.bo.UserBo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 22:52 2018/4/9
*/
public class PasswordHelp {
    public static Object  passwordSalt(String userName,Object password){
        String hashAlgorithmName = "MD5";//加密方式
        ByteSource salt = ByteSource.Util.bytes(userName);//以账号作为盐值
        int hashIterations = 1024;//加密1024次
        return new SimpleHash(hashAlgorithmName,password,salt,hashIterations);
        
    }
}