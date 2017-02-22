package com.malin.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by luyanian on 2017/2/20.
 * 验证公共类
 */

public class VerifyUtil {
    /**
     * 是否为空字符串
     * @param text
     * @return
     */
    public static boolean verifyEmpty(String text){
        return text.equals("");
    }

    /**
     * 验证是否为手机号
     * @param phone
     * @return
     */
    public static boolean verifyPhone(String phone){
        Pattern p = Pattern.compile("^1\\d{10}$");
        Matcher m = p.matcher(phone);
        return m.matches();
    }

    /**
     *验证是否为邮箱
     * @param email
     * @return
     */
    public static boolean verifyEmail(String email){
        Pattern p = Pattern.compile("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$");
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
