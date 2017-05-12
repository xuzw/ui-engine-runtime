package com.github.xuzw.ui_engine_runtime.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月8日 上午11:14:07
 */
public @interface StyleBlockAnnotation {
    String selector() default "";

    StyleDeclarationAnnotation[] value();
}
