package com.github.xuzw.ui_engine_runtime.div.location;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月5日 下午12:37:31
 */
public class ClassName {
    public static String of(Class<?> clz) {
        return clz.getSimpleName();
    }

    public static String selector(Class<?> clz, String selector) {
        return of(clz) + selector;
    }

    public static String selector(Class<?> clz) {
        return of(clz);
    }
}
