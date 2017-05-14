package com.github.xuzw.ui_engine_runtime.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import com.github.xuzw.ui_engine_runtime.UiEngine;
import com.github.xuzw.ui_engine_runtime.event.Event;
import com.github.xuzw.ui_engine_runtime.page.ErrorPage;
import com.github.xuzw.ui_engine_runtime.page.Page;
import com.github.xuzw.ui_engine_runtime.style.ExternalStyleSheet;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:50:49
 */
public class SimpleUiEngine implements UiEngine {
    private static final Charset encoding = Charset.forName("utf8");
    private Map<String, Page> map = new HashMap<>();
    private ErrorPage errorPage;
    private List<ExternalStyleSheet> externalStyleSheets = new ArrayList<>();

    @Override
    public void setExternalStyleSheets(List<ExternalStyleSheet> externalStyleSheets) {
        this.externalStyleSheets = externalStyleSheets;
    }

    @Override
    public List<ExternalStyleSheet> getExternalStyleSheets() {
        return externalStyleSheets;
    }

    @Override
    public void setPage(String pageName, Page page) {
        page.setEngine(this);
        if (!externalStyleSheets.isEmpty()) {
            page.getHeader().getExternalStyleSheets().addAll(externalStyleSheets);
        }
        map.put(pageName, page);
    }

    @Override
    public Page getPage(String pageName) {
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

    @Override
    public void writeHtmlFiles(String folder) throws IOException {
        for (String name : map.keySet()) {
            File file = new File(folder, name + ".html");
            OutputStream output = new FileOutputStream(file);
            IOUtils.write(getPage(name).toHtml(), output, encoding);
            IOUtils.closeQuietly(output);
        }
    }

    @Override
    public Page execute(Event event) {
        try {
            return event.execute();
        } catch (Throwable e) {
            errorPage.setThrowable(e);
            return errorPage;
        }
    }
}
