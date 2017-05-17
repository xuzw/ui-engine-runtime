package com.github.xuzw.ui_engine_runtime.impl;

import java.util.List;

import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.page.Page;
import com.github.xuzw.ui_engine_runtime.script.ExternalScript;
import com.github.xuzw.ui_engine_runtime.style.ExternalStyleSheet;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午11:27:27
 */
public class CommonUiEngine extends SimpleUiEngine {
    private List<ExternalStyleSheet> commonExternalStyleSheets;
    private List<ExternalScript> commonExternalScripts;

    public CommonUiEngine(List<ExternalStyleSheet> commonExternalStyleSheets, List<ExternalScript> commonExternalScripts) {
        this.commonExternalStyleSheets = commonExternalStyleSheets;
        this.commonExternalScripts = commonExternalScripts;
    }

    public void addPage(String name, String title, Div body) {
        addPage(new Page(name).title(title).body(body).externalStyleSheets(commonExternalStyleSheets).externalScripts(commonExternalScripts));
    }
}
