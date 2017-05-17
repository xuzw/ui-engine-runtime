package com.github.xuzw.ui_engine_runtime.event;

import com.github.xuzw.ui_engine_runtime.page.Page;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:25:08
 */
public abstract class ClickEvent extends Event {
    @Override
    public Page execute() {
        Page source = getSource();
        source.getHeader().clearScript();
        onClick();
        return source;
    }

    public void onClick() {
    }
}
