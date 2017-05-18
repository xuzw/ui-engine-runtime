package com.github.xuzw.ui_engine_runtime.page;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月18日 上午11:00:17
 */
public class PageName {
    public static String of(Class<?> clz) {
        return clz.getSimpleName();
    }
}
