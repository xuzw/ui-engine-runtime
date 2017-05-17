package com.github.xuzw.ui_engine_runtime;

import java.util.List;

import com.github.xuzw.ui_engine_runtime.event.Event;
import com.github.xuzw.ui_engine_runtime.page.ErrorPage;
import com.github.xuzw.ui_engine_runtime.page.Page;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午9:46:38
 */
public interface UiEngine {
    void addPage(Page page);

    Page getPage(String pageName);

    List<String> getPageNames();

    void setErroPage(ErrorPage errorPage);

    ErrorPage getErroPage();

    Page execute(Event event);
}
