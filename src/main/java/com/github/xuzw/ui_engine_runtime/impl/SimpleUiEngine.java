package com.github.xuzw.ui_engine_runtime.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.xuzw.ui_engine_runtime.UiEngine;
import com.github.xuzw.ui_engine_runtime.page.AbstractPage;
import com.github.xuzw.ui_engine_runtime.page.ErrorPage;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:50:49
 */
public class SimpleUiEngine implements UiEngine {
    private Map<String, AbstractPage> map = new HashMap<>();
    private ErrorPage errorPage;

    @Override
    public void addPage(AbstractPage page) {
        page.setEngine(this);
        map.put(page.getName(), page);
    }

    @Override
    public AbstractPage getPage(String pageName) {
        return map.get(pageName);
    }

    @Override
    public List<String> getPageNames() {
        return new ArrayList<>(map.keySet());
    }

    @Override
    public void setErroPage(ErrorPage errorPage) {
        errorPage.setEngine(this);
        this.errorPage = errorPage;
    }

    @Override
    public ErrorPage getErroPage() {
        return errorPage;
    }
}
