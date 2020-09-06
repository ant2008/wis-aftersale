package com.wenc.core.util;

import java.util.Base64;

public class Base64Helper {

    /**
     * 加密
     * @param aStr
     * @return
     */
    public static  String  encode(String aStr)
    {
        byte[] bts = null;

        String retStr = "";

        try
        {
            if(aStr == null || aStr.trim().equals(""))
            {
                return null;
            }

          return   Base64.getEncoder().encodeToString(aStr.getBytes());


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return null;
    }


    /**
     * 解码
     * @param aStr
     * @return
     */
    public static  String  decode(String aStr)
    {
        byte[] bts = null;

        try
        {
            if(aStr == null || aStr.trim().equals(""))
            {
                return null;
            }

          bts = Base64.getDecoder().decode(aStr.getBytes());


          if(bts == null || bts.length <= 0)
          {
              return null;
          }

          return new String(bts);

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return null;
    }


    /**
     * 解码成字符串数组
     * @param aStr
     * @param aSplitStr
     * @return
     */
    public static  String[] decodeToSplitStr(String aStr,String aSplitStr)
    {
        String retStr = "";

        try
        {

            retStr = decode(aStr);

            if(retStr == null || retStr.trim().equals(""))
            {
                return null;
            }


         return    retStr.split("||"+aSplitStr);


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return null;
    }
}
