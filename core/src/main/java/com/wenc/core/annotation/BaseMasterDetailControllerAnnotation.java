package com.wenc.core.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>对注解类进行调整,保留serialCode,keyColName 其他舍去</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface BaseMasterDetailControllerAnnotation {

    String serialCode();

    String keyColName();


//    /**
//     * 需要指定的查询的类名
//     *
//     * @return
//     */
//    Class searchClass() default Object.class;
//
//
//    /**
//     * 主类
//     *
//     * @return
//     */
//    Class masterClass() default Object.class;
//
//    /**
//     * 子类
//     *
//     * @return
//     */
//    Class detailClass() default Object.class;
//
//
//    /**
//     * 浏览主类
//     *
//     * @return
//     */
//    Class voMasterClass() default Object.class;
//
//
//    /**
//     * 浏览子类
//     *
//     * @return
//     */
//    Class voDetailClass() default Object.class;

}
