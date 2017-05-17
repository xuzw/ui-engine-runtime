package com.github.xuzw.ui_engine_runtime.page;

import java.text.SimpleDateFormat;
import java.util.List;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.UiEngine;
import com.github.xuzw.ui_engine_runtime.html.HtmlElement;
import com.github.xuzw.ui_engine_runtime.script.ExternalScript;
import com.github.xuzw.ui_engine_runtime.script.Script;
import com.github.xuzw.ui_engine_runtime.style.ExternalStyleSheet;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午1:32:34
 */
public abstract class AbstractPage implements HtmlElement {
    private UiEngine engine;
    private Header header;
    private String name;

    public AbstractPage(String name) {
        this.name = name;
        header = new Header(name);
    }

    @Override
    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        root.text("<!DOCTYPE html>");
        HtmlBuilder html = root.child("html").attr("lang", "zh-cmn-Hans");
        HtmlBuilder head = html.child("head");
        head.child("title").text(header.getTitle());
        head.child("meta").attr("charset", "utf-8");
        head.child("meta").attr("name", "generator").attr("content", _buildTime());
        for (ExternalStyleSheet x : header.getExternalStyleSheets()) {
            head.child("link").attr("rel", "stylesheet").attr("type", "text/css").attr("href", x.getHref());
        }
        for (ExternalScript x : header.getExternalScripts()) {
            head.child("script").attr("type", "text/javascript").attr("src", x.getSrc());
        }
        for (Script x : header.getScripts()) {
            head.child("script").attr("type", "text/javascript").text(x.toString());
        }
        build(html);
        return root.build();
    }

    protected abstract void build(HtmlBuilder html);

    private static String _buildTime() {
        return new SimpleDateFormat("yyyy.MM.dd hh:mm:ss.SSS").format(System.currentTimeMillis());
    }

    public AbstractPage title(String title) {
        header.setTitle(title);
        return this;
    }

    public AbstractPage scripts(List<Script> scripts) {
        for (Script script : scripts) {
            header.addScript(script);
        }
        return this;
    }

    public AbstractPage externalScripts(List<ExternalScript> externalScripts) {
        for (ExternalScript externalScript : externalScripts) {
            header.addExternalScript(externalScript);
        }
        return this;
    }

    public AbstractPage externalStyleSheets(List<ExternalStyleSheet> externalStyleSheets) {
        for (ExternalStyleSheet externalStyleSheet : externalStyleSheets) {
            header.addExternalStyleSheet(externalStyleSheet);
        }
        return this;
    }

    public UiEngine getEngine() {
        return engine;
    }

    public void setEngine(UiEngine engine) {
        this.engine = engine;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
