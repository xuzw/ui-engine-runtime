package com.github.xuzw.ui_engine_runtime.div.ajax;

import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;
import com.github.xuzw.ui_engine_runtime.div.wrapper.Wrapper;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月18日 上午9:37:11
 */
public class DynamicDiv extends Wrapper {
    private String id;

    public DynamicDiv(String id, Div element) {
        super(element);
        this.id = id;
    }

    public DynamicDiv(Div element) {
        this(id(element.getClass()), element);
    }

    public static String id(Class<?> clz) {
        return "dynamic_div-wrapper-" + ClassName.of(clz);
    }

    @Override
    public String getId() {
        return id;
    }
}
