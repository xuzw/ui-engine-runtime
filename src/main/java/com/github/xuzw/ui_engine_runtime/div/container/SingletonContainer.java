package com.github.xuzw.ui_engine_runtime.div.container;

import com.github.xuzw.ui_engine_runtime.div.location.Id;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午11:51:19
 */
public abstract class SingletonContainer extends Container {
    @Override
    public String getId() {
        return Id.of(getClass());
    }
}
