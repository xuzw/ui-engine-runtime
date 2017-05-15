package com.github.xuzw.ui_engine_runtime.div.location;

import java.util.UUID;

import com.github.xuzw.ui_engine_runtime.div.Div;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:04:53
 */
public class Id {
    public static String of(Div div) {
        return String.valueOf(div.hashCode());
    }

    public static String uuid() {
        return UUID.randomUUID().toString();
    }
}
