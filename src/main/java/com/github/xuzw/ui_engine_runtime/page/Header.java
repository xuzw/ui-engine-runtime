package com.github.xuzw.ui_engine_runtime.page;

import java.util.List;

import com.github.xuzw.ui_engine_runtime.script.ExternalScript;
import com.github.xuzw.ui_engine_runtime.style.ExternalStyleSheet;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午9:48:34
 */
public class Header {
    private String title;
    private List<ExternalScript> externalScripts;
    private List<ExternalStyleSheet> externalStyleSheets;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ExternalScript> getExternalScripts() {
        return externalScripts;
    }

    public void setExternalScripts(List<ExternalScript> externalScripts) {
        this.externalScripts = externalScripts;
    }

    public List<ExternalStyleSheet> getExternalStyleSheets() {
        return externalStyleSheets;
    }

    public void setExternalStyleSheets(List<ExternalStyleSheet> externalStyleSheets) {
        this.externalStyleSheets = externalStyleSheets;
    }
}
