package com.github.xuzw.ui_engine_runtime;

import java.io.IOException;
import java.util.List;

import com.github.xuzw.ui_engine_runtime.event.Event;
import com.github.xuzw.ui_engine_runtime.page.ErrorPage;
import com.github.xuzw.ui_engine_runtime.page.Page;
import com.github.xuzw.ui_engine_runtime.style.ExternalStyleSheet;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午9:46:38
 */
public interface UiEngine {
    List<String> getPageNames();

    void setPage(String name, Page page);

    Page getPage(String name);

    Page execute(Event event);

    void setErroPage(ErrorPage errorPage);

    ErrorPage getErroPage();

    List<ExternalStyleSheet> getExternalStyleSheets();

    void setExternalStyleSheets(List<ExternalStyleSheet> externalStyleSheets);

    void writeHtmlFile(String folder, String name) throws IOException;
}
