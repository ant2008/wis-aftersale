package com.wenc.core.util;

import java.io.UnsupportedEncodingException;

/**
 * UNICODE字符工具类
 *
 * @author jason
 * @version 1.0
 */
public  class UnicodeHelper {

    /**
     * Unicode 转换UTF8 字符串
     *
     * @param aStr              输入字符串
     * @return                  UFT8字符串
     */
   static public  String UnicodeToUtf8(String aStr)
    {
        String retStr = "";

        try {
// Convert from Unicode to UTF-8

            byte[] utf8 = aStr.getBytes("UTF-8");
// Convert from UTF-8 to Unicode
            retStr = new String(utf8, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return retStr;

    }

    /**
     * 判断是否存在emoji字符
     *
     * @param codePoint         输入字符
     * @return                  true-存在 false-否
     */
    private static boolean isNotEmojiCharacter(char codePoint)
    {
        return (codePoint == 0x0) ||
                (codePoint == 0x9) ||
                (codePoint == 0xA) ||
                (codePoint == 0xD) ||
                ((codePoint >= 0x20) && (codePoint <= 0xD7FF)) ||
                ((codePoint >= 0xE000) && (codePoint <= 0xFFFD)) ||
                ((codePoint >= 0x10000) && (codePoint <= 0x10FFFF));
    }
    /**
     * 过滤emoji 或者 其他非文字类型的字符
     * @param source            输入字符串
     * @return                  返回过滤后字符串
     */
    public static String filterEmoji(String source)
    {
        int len = source.length();
        StringBuilder buf = new StringBuilder(len);
        for (int i = 0; i < len; i++)
        {
            char codePoint = source.charAt(i);
            if (isNotEmojiCharacter(codePoint))
            {
                buf.append(codePoint);
            } else{

                buf.append("*");

            }
        }
        return buf.toString();
    }
}
