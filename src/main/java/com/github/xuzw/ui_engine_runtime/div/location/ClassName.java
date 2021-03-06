package com.github.xuzw.ui_engine_runtime.div.location;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月5日 下午12:37:31
 */
public class ClassName {
    public static String of(Class<?> clz) {
        return clz.getName().replaceAll("\\.", "-");
    }

    public static String selector(Class<?> clz, String selector) {
        String base = of(clz);
        if (selector.startsWith(":") || selector.startsWith(">") || selector.startsWith(" ")) {
            return base + selector;
        }
        return base + " " + selector;
    }

    public static String selector(Class<?> clz) {
        return of(clz);
    }
}
