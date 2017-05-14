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
    void setExternalStyleSheets(List<ExternalStyleSheet> externalStyleSheets);

    List<ExternalStyleSheet> getExternalStyleSheets();

    void setPage(String pageName, Page page);

    Page getPage(String pageName);

    List<String> getPageNames();

    void setErroPage(ErrorPage errorPage);

    ErrorPage getErroPage();

    void writeHtmlFiles(String folder) throws IOException;

    Page execute(Event event);
}
