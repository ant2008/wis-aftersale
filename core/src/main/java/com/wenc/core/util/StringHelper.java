package com.wenc.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 *
 * @author bv
 * @date 2019.4.20
 */
public class StringHelper {

    public static boolean getStr(String[] aArray, String aStr) {

        if (aArray == null || aArray.length <= 0) return false;
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i].toLowerCase().trim().equals(aStr.toLowerCase().trim())) {
                return true;
            }
        }

        return false;
    }


    /*
     * 判断是否为整数
     * @param str 传入的字符串
     * @return 是整数返回true,否则返回false
     */


    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }


    /**
     * 判断是否为手机格式。
     * @param phone
     * @return
     */
    public static boolean isPhone(String phone) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
//            MToast.showToast("手机号应为11位数");
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
//            LogUtil.e(isMatch);
//            if (!isMatch) {
//                MToast.showToast("请填入正确的手机号");
//            }
            return isMatch;
        }
    }


    /**
     * 是否汉字
     * @param aStr
     * @return
     */
    public static boolean isChinese(String aStr)
    {
        String regex = "^[\\u4e00-\\u9fa5]{0,}$";
        return aStr.matches(regex);
    }


    /**
     * 是否字母或汉字
     * @param aStr
     * @return
     */
    public static  boolean isLetterOrChinese(String aStr)
    {


        String regex = " ^[A-Za-z0-9]{4,40}$";
        return aStr.matches(regex);
    }


    /**
     * 是否Email
     * @param aStr
     * @return
     */
    public static  boolean isEmail(String aStr)
    {


        String regex = " ^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        return aStr.matches(regex);
    }


    /**
     * 是否URL
     * @param aStr
     * @return
     */
    public static  boolean isUrl(String aStr)
    {


        String regex = "^http://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
        return aStr.matches(regex);
    }


    /**
     * 是否身份证号
     * @param aStr
     * @return
     */
    public static  boolean isIdCard(String aStr)
    {


        String regex = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)\n";
        return aStr.matches(regex);
    }


    /**
     * 是否强密码
     * @param aStr
     * @return
     */
    public static  boolean isStrongPwd(String aStr)
    {


        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$";
        return aStr.matches(regex);
    }


    /**
     * 是否日期
     * @param aStr
     * @return
     */
    public static  boolean isDate(String aStr)
    {


        String regex = "^\\d{4}-\\d{1,2}-\\d{1,2}";
        return aStr.matches(regex);
    }


    /**
     * 是否邮政编码
     * @param aStr
     * @return
     */
    public static  boolean isChinaPostCode(String aStr)
    {


        String regex = "[1-9]\\d{5}(?!\\d)";
        return aStr.matches(regex);
    }

    /**
     * 是否手机号或者座机号
     * @param aStr
     * @return
     */
    public static  boolean isPhoneNo(String aStr)
    {


        String regex = "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)";
        return aStr.matches(regex);
    }

    /**
     * 是否IP地址。
     * @param aStr
     * @return
     */
    public static  boolean isIpaddress(String aStr)
    {


        String regex = "((?:(?:25[0-5]|2[0-4]\\\\d|[01]?\\\\d?\\\\d)\\\\.){3}(?:25[0-5]|2[0-4]\\\\d|[01]?\\\\d?\\\\d))";
        return aStr.matches(regex);
    }








}
