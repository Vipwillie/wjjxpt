package com.willie.springmvc.base.util.security;

import org.apache.shiro.crypto.hash.Md5Hash;

/************************************************
 * <p>Copyright © by whxxykj</p>
 * <p>All right reserved.</p>
 * <p>Create Author: Willie</p>
 * <p> Create Date  : 2018/4/18</p>
 * <p>Last version : 1.0</p>
 * <p>Description  : </p>
 * <p>Last Update Date:</p>
 * <p>Change Log:</p>
 **************************************************/
public abstract class MD5Util {
    /**
     * 对文本进行md5加密处理
     *
     * @param text 待加密文本
     * @return 加密后文本
     */
    public static String Md5Hash(String text) {
        return Md5Hash(text, null);
    }

    /**
     * 对文本进行md5加密处理
     *
     * @param text 待加密文本
     * @param sale 加密盐
     * @return 加密后文本
     */
    public static String Md5Hash(String text, String sale) {
        String md5 = null;
        if (sale == null) {
            md5 = new Md5Hash(text).toString();
        } else {
            md5 = new Md5Hash(text, sale).toString();
        }
        return md5;
    }
}