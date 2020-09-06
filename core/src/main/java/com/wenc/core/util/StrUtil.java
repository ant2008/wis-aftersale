package com.wenc.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符帮助类
 *
 * @author jason
 * @version 1.0
 * @see com.lyl.core.dao.IDao
 */
public class StrUtil {

    /**
     * 替换空格回车及换行
     * @param str           输入字符串
     * @return              替换空格字符串
     */
     public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }


    /**
     * 替换回车
     * @param str           输入字符串
     * @return              替换回车符的字符串
     */
    public static String replaceRTN(String str,String aReplaceStr) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll(aReplaceStr);
        }
        return dest;
    }

    /**
     * 替换\n
     * @param str               输入字符串
     * @param aReplaceStr       需要替换字符串
     * @return                  替换后字符串
     */
    public static String replaceN(String str,String aReplaceStr) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll(aReplaceStr);
        }
        return dest;
    }


    /**
     * 替换\t
     * @param str               输入字符串
     * @param aReplaceStr       需要替换字符串
     * @return                  替换后字符串
     */
    public static String replaceT(String str,String aReplaceStr) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\t");
            Matcher m = p.matcher(str);
            dest = m.replaceAll(aReplaceStr);
        }
        return dest;
    }

    /**
     * 替换\r
     * @param str              输入字符串
     * @param aReplaceStr       需要替换字符串
     * @return                  替换后字符初见
     */
    public static String replaceR(String str,String aReplaceStr) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\r");
            Matcher m = p.matcher(str);
            dest = m.replaceAll(aReplaceStr);
        }
        return dest;
    }

    /**
     * 替换回车换行
     * @param str               输入字符串
     * @param aReplaceStr       需替换字符串
     * @return                  替换后字符串
     */
    public static String replaceRN(String str,String aReplaceStr) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll(aReplaceStr);
        }
        return dest;
    }


    /**
     * 替换特殊字符，自定义
     * @param str               输入字符串
     * @param aSpecStr          特殊字符串
     * @param aReplaceStr       替换字符串
     * @return                  替换后字符串
     */
    public static String replaceSepcStr(String str,String aSpecStr,String aReplaceStr) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile(aSpecStr);
            Matcher m = p.matcher(str);
            dest = m.replaceAll(aReplaceStr);
        }
        return dest;
    }


    /**
     * 脱敏过滤名字
     * @param aName             输入名字
     * @return                  脱敏后名字
     */
    public static String nameFilter(String aName)
    {
        String retStr = "";


        if(aName == null ||aName.trim().equals(""))
        {
            return null;
        }

        //两个名字
        if(aName.trim().length() <= 2)
        {
            retStr =  aName.trim().substring(0,1)+ "*";

        }else if(aName.trim().length() == 3)//两个及以上名字
        {
            retStr = aName.trim().substring(0,1)+"*"+ aName.trim().substring(2);
        }else
        {
            retStr = aName.trim().substring(0,1)+"**"+ aName.trim().substring(3);
        }

        return  retStr;

    }


    /**
     * 过滤脱敏身份证
     * @param aIdCard           输入身份证号
     * @return                  脱敏后身份证号
     */
    public static String idCardFilter(String aIdCard)
    {
        String retStr = "";


        if(aIdCard == null || aIdCard.trim().equals(""))
        {
            return  null;
        }

        if(aIdCard.trim().length() >= 18) {
            retStr = aIdCard.trim().substring(0, 7) + "********" + aIdCard.trim().substring(16);
        }else if(aIdCard.trim().length() >= 7 && aIdCard.trim().length() < 18 )
        {
            retStr = aIdCard.trim().substring(0, 7) + "********";
        }else
        {
            retStr = aIdCard.trim();
        }

        return retStr;

    }


    /**
     * 过滤脱敏手机号。
     * @param aMobileNo         输入手机号
     * @return                  脱敏后手机号
     */
    public static String mobilenoFilter(String aMobileNo)
    {
        String retStr = "";


        if(aMobileNo == null || aMobileNo.trim().equals(""))
        {
            return null;
        }

        retStr  = aMobileNo.trim().substring(0,3)+"****"+aMobileNo.trim().substring(7);

        return retStr;
    }



    public static boolean isLetterDigitOrChinese(String str) {
        //其他需要，直接修改正则表达式就好
        String regex = "^[a-z0-9A-Z\u4e00-\u9fa5]+$";
        return str.matches(regex);
    }

    public static boolean isChinese(String aStr)
    {
        String regex = "^[\\u4e00-\\u9fa5]{0,}$";
        return aStr.matches(regex);
    }

    /**
     * 判断是否为身份证信息。
     *
     * @param aStr
     * @return
     */
    public static  boolean isIdCard(String aStr)
    {


        String regex = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)\n";
        return aStr.matches(regex);
    }



}
