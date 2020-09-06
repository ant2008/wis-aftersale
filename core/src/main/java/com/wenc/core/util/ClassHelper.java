package com.wenc.core.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class ClassHelper {

    protected static Logger LOG = LogManager.getLogger(ClassHelper.class);

    /**
     * 通过反射,获得指定类的父类的泛型参数的实际类型. 如BuyerServiceBean extends DaoSupport<Buyer>
     *
     * @param clazz clazz 需要反射的类,该类必须继承范型父类
     * @param index 泛型参数所在索引,从0开始.
     * @return 范型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
     * <code>Object.class</code>
     */
    @SuppressWarnings("unchecked")
    public static Class getSuperClassGenricType(Class clazz, int index) {
        Type genType = clazz.getGenericSuperclass();// 得到泛型父类
        // 如果没有实现ParameterizedType接口，即不支持泛型，直接返回Object.class
        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }
        // 返回表示此类型实际类型参数的Type对象的数组,数组里放的都是对应类型的Class, 如BuyerServiceBean extends
        // DaoSupport<Buyer,Contact>就返回Buyer和Contact类型
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        if (index >= params.length || index < 0) {
            throw new RuntimeException("你输入的索引"
                    + (index < 0 ? "不能小于0" : "超出了参数的总数"));
        }
        if (!(params[index] instanceof Class)) {
            return Object.class;
        }
        return (Class) params[index];
    }

    /**
     * 通过反射,获得指定类的父类的第一个泛型参数的实际类型. 如BuyerServiceBean extends DaoSupport<Buyer>
     *
     * @param clazz clazz 需要反射的类,该类必须继承泛型父类
     * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
     * <code>Object.class</code>
     */
    @SuppressWarnings("unchecked")
    public static Class getSuperClassGenricType(Class clazz) {
        return getSuperClassGenricType(clazz, 0);
    }

    /**
     * 通过反射,获得方法返回值泛型参数的实际类型. 如: public Map<String, Buyer> getNames(){}
     *
     * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
     * <code>Object.class</code>
     * @paramMethod method 方法
     * @paramint index 泛型参数所在索引,从0开始.
     */
    @SuppressWarnings("unchecked")
    public static Class getMethodGenericReturnType(Method method, int index) {
        Type returnType = method.getGenericReturnType();
        if (returnType instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType) returnType;
            Type[] typeArguments = type.getActualTypeArguments();
            if (index >= typeArguments.length || index < 0) {
                throw new RuntimeException("你输入的索引"
                        + (index < 0 ? "不能小于0" : "超出了参数的总数"));
            }
            return (Class) typeArguments[index];
        }
        return Object.class;
    }

    /**
     * 通过反射,获得方法返回值第一个泛型参数的实际类型. 如: public Map<String, Buyer> getNames(){}
     *
     * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
     * <code>Object.class</code>
     * @paramMethod method 方法
     */
    @SuppressWarnings("unchecked")
    public static Class getMethodGenericReturnType(Method method) {
        return getMethodGenericReturnType(method, 0);
    }

    /**
     * 通过反射,获得方法输入参数第index个输入参数的所有泛型参数的实际类型. 如: public void add(Map<String,
     * Buyer> maps, List<String> names){}
     *
     * @return 输入参数的泛型参数的实际类型集合, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回空集合
     * @paramMethod method 方法
     * @paramint index 第几个输入参数
     */
    @SuppressWarnings("unchecked")
    public static List<Class> getMethodGenericParameterTypes(Method method,
                                                             int index) {
        List<Class> results = new ArrayList<Class>();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        if (index >= genericParameterTypes.length || index < 0) {
            throw new RuntimeException("你输入的索引"
                    + (index < 0 ? "不能小于0" : "超出了参数的总数"));
        }
        Type genericParameterType = genericParameterTypes[index];
        if (genericParameterType instanceof ParameterizedType) {
            ParameterizedType aType = (ParameterizedType) genericParameterType;
            Type[] parameterArgTypes = aType.getActualTypeArguments();
            for (Type parameterArgType : parameterArgTypes) {
                Class parameterArgClass = (Class) parameterArgType;
                results.add(parameterArgClass);
            }
            return results;
        }
        return results;
    }

    /**
     * 通过反射,获得方法输入参数第一个输入参数的所有泛型参数的实际类型. 如: public void add(Map<String, Buyer>
     * maps, List<String> names){}
     *
     * @return 输入参数的泛型参数的实际类型集合, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回空集合
     * @paramMethod method 方法
     */
    @SuppressWarnings("unchecked")
    public static List<Class> getMethodGenericParameterTypes(Method method) {
        return getMethodGenericParameterTypes(method, 0);
    }

    /**
     * 通过反射,获得Field泛型参数的实际类型. 如: public Map<String, Buyer> names;
     *
     * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
     * <code>Object.class</code>
     * @paramField field 字段
     * @paramint index 泛型参数所在索引,从0开始.
     */
    @SuppressWarnings("unchecked")
    public static Class getFieldGenericType(Field field, int index) {
        Type genericFieldType = field.getGenericType();

        if (genericFieldType instanceof ParameterizedType) {
            ParameterizedType aType = (ParameterizedType) genericFieldType;
            Type[] fieldArgTypes = aType.getActualTypeArguments();
            if (index >= fieldArgTypes.length || index < 0) {
                throw new RuntimeException("你输入的索引"
                        + (index < 0 ? "不能小于0" : "超出了参数的总数"));
            }
            return (Class) fieldArgTypes[index];
        }
        return Object.class;
    }

    /**
     * 通过反射,获得Field泛型参数的实际类型. 如: public Map<String, Buyer> names;
     *
     * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回
     * <code>Object.class</code>
     * @paramField field 字段
     * @paramint index 泛型参数所在索引,从0开始.
     */
    @SuppressWarnings("unchecked")
    public static Class getFieldGenericType(Field field) {
        return getFieldGenericType(field, 0);
    }

    public static <T> Object getColValue(String aColName, T aModel) {
        Class<?> cls = null;
        Field[] fields = null;
        String fieldName = "";
        String firstLetter = "";
        String methodName = "";
        Method setMethod = null;
        String billcode = "";

        try {
            cls = Class.forName(aModel.getClass().getName());
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        //LOG.info("class helper:cls"+cls.toString());

        if (cls.getSuperclass() != null) {
            fields = cls.getSuperclass().getDeclaredFields();
        }

        if (fields == null || fields.length <= 0) {

            fields = cls.getDeclaredFields();

        }


        try {
            for (int i = 0; i < fields.length; i++) {
                fieldName = fields[i].getName();

                //LOG.info("fieldname=" + fieldName);

                if (fieldName.toUpperCase().trim()
                        .equals(aColName.trim().toUpperCase())) {
                    fields[i].setAccessible(true);

                    //;LOG.info("MASTER ORDERNO:" + fields[i].get(aModel));
                    billcode = (String) fields[i].get(aModel);
                    break;

                }
            }

        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        LOG.info("CLASSHELPER END:" + billcode);
        return billcode;

    }

    /**
     * 获取原始数值
     *
     * @param aColName
     * @param aModel
     * @param <T>
     * @return
     */
    public static <T> Object getColValueByColName(String aColName, T aModel) {
        Class<?> cls = null;
        Field[] fields = null;
        String fieldName = "";
        String firstLetter = "";
        String methodName = "";
        Method setMethod = null;

        Object colValue = null;


        try {
            cls = Class.forName(aModel.getClass().getName());
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        //LOG.info("class helper:cls"+cls.toString());

        if (cls.getSuperclass() != null) {
            fields = cls.getSuperclass().getDeclaredFields();
        }

        if (fields == null || fields.length <= 0) {

            fields = cls.getDeclaredFields();

        }


        try {
            for (int i = 0; i < fields.length; i++) {
                fieldName = fields[i].getName();


                if (fieldName.toUpperCase().trim()
                        .equals(aColName.trim().toUpperCase())) {
                    fields[i].setAccessible(true);

                    //;LOG.info("MASTER ORDERNO:" + fields[i].get(aModel));
                    colValue = fields[i].get(aModel);
                    break;

                }
            }

        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return colValue;
    }

    public static <T> Object setColValue(String aColName, Object aValue,
                                         T aModel) throws ClassNotFoundException, NoSuchMethodException,
            SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Class<?> cls = null;
        Field[] fields = null;
        String fieldName = "";
        String firstLetter = "";
        String methodName = "";
        Method setMethod = null;

        cls = Class.forName(aModel.getClass().getName());
        fields = cls.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fieldName = fields[i].getName();

            if (fieldName.toUpperCase().trim()
                    .equals(aColName.trim().toUpperCase())) {
                firstLetter = fieldName.substring(0, 1).toUpperCase().trim();
                methodName = "set" + firstLetter.trim()
                        + fieldName.substring(1);
                setMethod = cls.getDeclaredMethod(methodName,
                        fields[i].getType());
                setMethod.invoke(aModel, aValue);
                break;
            }

        }

        return aModel;

    }

    public static <T> List<T> setColValue(String aColName, Object aValue,
                                          List<T> aList) throws ClassNotFoundException,
            NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        T t = null;
        List<T> retList = null;

        if (aList != null) {

            for (int i = 0; i < aList.size(); i++) {
                t = aList.get(i);
                t = (T) setColValue(aColName, aValue, t);
                aList.set(i, t);
            }

        }

        return aList;
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


    public static boolean ClassExistsFieldName(String aClassName, String aFieldName) {
        Class<?> cls = null;
        Field[] fields = null;
        String fieldName = "";
        String firstLetter = "";
        String methodName = "";
        Method setMethod = null;

        try {
            cls = Class.forName(aClassName.trim());

            fields = cls.getFields();

            for (int i = 0; i < fields.length; i++) {
                fieldName = fields[i].getName();
                if (fieldName.toLowerCase().trim().equals(aFieldName.toLowerCase().trim())) {
                    return true;
                }

            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return false;
    }
}

