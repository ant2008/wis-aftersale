package com.wenc.core.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * spring mmvc 上下文工具类
 *
 * @author jason
 * @version 1.0
 * @see com.lyl.core.dao.IDao
 */
@Component
public class SpringContextHelper implements ApplicationContextAware {

        private static ApplicationContext context;
        @Override
       // @SuppressWarnings("static-access" )
        public void setApplicationContext(ApplicationContext contex)
                throws BeansException {
// TODO Auto-generated method stub

           // WebApplicationContextUtils.

            this.context = contex;
        }
        public static Object getBean(String beanName){
            return context.getBean(beanName);
        }
        public static String getMessage(String key){
            return context.getMessage(key, null, Locale.getDefault());
        }

        public  static  Object getBean(Class<?> aClass )
        {
            return context.getBean(aClass);
        }




}
