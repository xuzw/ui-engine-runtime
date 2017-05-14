package com.github.xuzw.ui_engine_runtime.event;

import com.github.xuzw.ui_engine_runtime.page.Page;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:25:30
 */
public class RefreshEvent extends Event {
    @Override
    public Page execute() {
        Page source = getSource();
        source.getBody().setPopup(null);
        return source;
    }
}
