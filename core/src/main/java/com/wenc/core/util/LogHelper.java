package com.wenc.core.util;

import cn.hutool.core.lang.Console;
import org.slf4j.Logger;

/**
 * @author w.li
 * @date 2019-12-31
 *
 * @see 1.0
 */
public class LogHelper {

    /**
     * 判断是否允许debug，节省资源
     * @param aLog
     * @param aMsg
     */
    static public void debug(Logger aLog,String aMsg)
    {
        if(aLog != null)
        {
            if(aLog.isDebugEnabled()) {
                aLog.debug(aMsg);
            }
        }
    }


   static public void debug(Logger aLog,String aMsg, Object aObj){

       if(aLog != null)
       {
           if(aLog.isDebugEnabled()) {
               aLog.debug(aMsg,aObj);
           }
       }

   }

   static public void debug(Logger aLog,String aMsg, Object aObj1, Object aObj2){
       if(aLog != null)
       {
           if(aLog.isDebugEnabled()) {
               aLog.debug(aMsg,aObj1,aObj2);
           }
       }
   }

   static public void debug(Logger aLog,String aMsg, Object... aObj){

       if(aLog != null)
       {
           if(aLog.isDebugEnabled()) {
               aLog.debug(aMsg,aObj);
           }
       }
   }

}
