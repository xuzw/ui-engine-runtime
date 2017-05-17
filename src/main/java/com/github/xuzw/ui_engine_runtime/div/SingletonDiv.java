package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.ui_engine_runtime.div.location.Id;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午9:50:55
 */
public abstract class SingletonDiv extends Div {
    @Override
    public String getId() {
        return Id.of(getClass());
    }
}
