package com.github.xuzw.ui_engine_runtime;

import java.util.List;

import com.github.xuzw.ui_engine_runtime.event.Event;
import com.github.xuzw.ui_engine_runtime.page.AbstractPage;
import com.github.xuzw.ui_engine_runtime.page.ErrorPage;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午9:46:38
 */
public interface UiEngine {
    void addPage(AbstractPage page);

    AbstractPage getPage(String pageName);

    List<String> getPageNames();

    void setErroPage(ErrorPage errorPage);

    ErrorPage getErroPage();

    AbstractPage execute(Event event);
}
