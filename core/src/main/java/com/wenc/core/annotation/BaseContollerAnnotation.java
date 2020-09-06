package com.wenc.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface BaseContollerAnnotation {

    /**
     * 需要指定的查询的类名
     *
     * @return
     */
    Class searchClass() default Object.class;
}
