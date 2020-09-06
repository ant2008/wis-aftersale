package com.wenc.core.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;

public class ConvertHelper {

    private static Logger LOG = LogManager.getLogger(ConvertHelper.class);

    /**
     * <p>Description: ʹ�÷������,����target���ֶ���ֵ,���Ǳ���ע��,targetӦ��Ϊsource�ĸ��� </p>
     *
     * @param source
     * @param target
     * @return
     * @author:admin
     * @date:
     * @version:1.0
     */
    public static <T, S> T convert(S source, T target) {
        Class<?> cls = null;
        Class<?> sourceCls = null;

        Field[] targetFields = null;
        Field[] sourceFields = null;

        Field sourceField = null;

        String targetFieldName = "";
        String targetFirstLetter = "";
        String targetSetMethodName = "";
        Method targetSetMethod = null;
        Method sourceSetMethod = null;

        String billcode = "";

        try {
            cls = Class.forName(target.getClass().getName());

            sourceCls = Class.forName(source.getClass().getName());


            if (cls == null) {
                return null;
            }

            if (sourceCls == null) {
                return null;
            }


            //���Ŀ������ֶ�
            targetFields = cls.getDeclaredFields();
            sourceFields = sourceCls.getDeclaredFields();

            for (int i = 0; i < targetFields.length; i++) {

                targetFieldName = targetFields[i].getName();
                targetFirstLetter = targetFieldName.substring(0, 1).toUpperCase().trim();
                targetSetMethodName = "set" + targetFirstLetter.trim()
                        + targetFieldName.substring(1);
                targetSetMethod = cls.getDeclaredMethod(targetSetMethodName, targetFields[i].getType());

                //��ȡԴͷ��ֵ���Ƹ�target����ͬ�ֶ�
                sourceField = sourceCls.getDeclaredField(targetFieldName);
                sourceField.setAccessible(true);

                targetSetMethod.invoke(target, sourceField.get(source));


            }


            //return target;

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return target;

    }


    public static <T, S> T convertToSuper(S source, T target) {
        Class<?> cls = null;
        Class<?> sourceCls = null;

        Field[] targetFields = null;
        Field[] sourceFields = null;

        Field sourceField = null;

        String targetFieldName = "";
        String targetFirstLetter = "";
        String targetSetMethodName = "";
        Method targetSetMethod = null;
        Method sourceSetMethod = null;

        String billcode = "";

        try {

            sourceCls = Class.forName(source.getClass().getName());
            if (sourceCls == null) {
                return null;
            }
            LOG.debug("sourceCls:" + source.getClass().getName());
            cls = Class.forName(target.getClass().getName());
            if (cls == null) {
                return null;
            }
            LOG.debug("targCls:" + cls.getClass().getName());


            //���Ŀ������ֶ�
            targetFields = cls.getDeclaredFields();
            sourceFields = sourceCls.getSuperclass().getDeclaredFields();

            for (int i = 0; i < targetFields.length; i++) {

                targetFieldName = targetFields[i].getName();

                if (targetFieldName.toUpperCase().equals("ANNOTATION")) {
                    continue;
                }

                targetFirstLetter = targetFieldName.substring(0, 1).toUpperCase().trim();

                targetSetMethodName = "set" + targetFirstLetter.trim()
                        + targetFieldName.substring(1);

                LOG.debug("Ŀ�귽��:" + targetSetMethodName);
                targetSetMethod = cls.getDeclaredMethod(targetSetMethodName, targetFields[i].getType());

                //��ȡԴͷ��ֵ���Ƹ�target����ͬ�ֶ�

                sourceField = sourceCls.getSuperclass().getDeclaredField(targetFieldName);
                sourceField.setAccessible(true);

                //LOG.info("convertsuper:"+sourceField.get(source).toString());
                targetSetMethod.invoke(target, sourceField.get(source));


            }


            //return target;

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return target;

    }


    /**
     * <p>Description: sourceΪtarget�ĸ��� </p>
     *
     * @param source
     * @param target
     * @author:admin
     * @date:
     * @version:1.0
     */
    public static <T, S> void convertModel(S source, T target) {
        Class<?> cls = null;
        Class<?> sourceCls = null;

        Field[] targetFields = null;
        Field[] sourceFields = null;

        Field sourceField = null;

        String targetFieldName = "";
        String targetFirstLetter = "";
        String targetSetMethodName = "";
        Method targetSetMethod = null;
        Method sourceSetMethod = null;

        String billcode = "";

        try {
            cls = Class.forName(target.getClass().getName());

            sourceCls = Class.forName(source.getClass().getName());


            if (cls == null) {
                return;
            }

            if (sourceCls == null) {
                return;
            }


            //���Ŀ������ֶ�
            targetFields = cls.getSuperclass().getDeclaredFields();
            sourceFields = sourceCls.getDeclaredFields();

            for (int i = 0; i < targetFields.length; i++) {

                targetFieldName = targetFields[i].getName();
                targetFirstLetter = targetFieldName.substring(0, 1).toUpperCase().trim();
                targetSetMethodName = "set" + targetFirstLetter.trim()
                        + targetFieldName.substring(1);
                targetSetMethod = cls.getSuperclass().getDeclaredMethod(targetSetMethodName, targetFields[i].getType());

                //��ȡԴͷ��ֵ���Ƹ�target����ͬ�ֶ�
                //LOG.info("sourceCls:"+i+sourceCls.toString());
                sourceField = sourceCls.getDeclaredField(targetFieldName.trim());
                sourceField.setAccessible(true);

                targetSetMethod.invoke(target, sourceField.get(source));


            }


            //	return target;

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


    public static String Convert2MD5(String aPwd) {

        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = aPwd.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();


    }


    public static <T> Object GetMethodValueByNum(T aT, int aNum) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = null;
        Field[] targetFields = null;
        String targetFieldName = "";
        String targetFirstLetter = "";
        String targetGetMethodName = "";
        Method targetGetMethod = null;
        Object retValue = null;

        try {


            cls = Class.forName(aT.getClass().getName());

            //���Ŀ������ֶ�
            targetFields = cls.getSuperclass().getDeclaredFields();

            for (int i = 0; i < targetFields.length; i++) {

                if (i == aNum) {

                    targetFieldName = targetFields[i].getName();
                    targetFirstLetter = targetFieldName.substring(0, 1).toUpperCase().trim();
                    targetGetMethodName = "get" + targetFirstLetter.trim() + targetFieldName.substring(1);
                    targetGetMethod = cls.getDeclaredMethod(targetGetMethodName, targetFields[i].getType());

                    retValue = targetGetMethod.invoke(cls);

                    if (retValue == null) {
                        retValue = "";
                    }

                    break;

                }


            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return retValue;
    }


    public static <T, M> T GetSuperClassByT(M aModel) {
        T cls = null;
        Class<?> sourceCls = null;

        if (aModel == null) {
            return null;
        }

        try {
            sourceCls = Class.forName(aModel.getClass().getName());

            if (sourceCls == null) {
                return null;
            }
            LOG.debug("sourceCls:" + aModel.getClass().getName());

            cls = (T) Class.forName(sourceCls.getGenericSuperclass().getTypeName()).newInstance();
            if (cls == null) {
                return null;
            }
            LOG.debug("targCls:" + cls.getClass().getName());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return cls;
    }

}
