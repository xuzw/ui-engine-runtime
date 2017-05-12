package com.github.xuzw.ui_engine_runtime.page;

import java.text.SimpleDateFormat;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.UiEngine;
import com.github.xuzw.ui_engine_runtime.style.ExternalStyleSheet;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午9:48:11
 */
public class Page {
    private UiEngine engine;
    private Header header;
    private Body body;

    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        root.text("<!DOCTYPE html>");
        HtmlBuilder html = root.child("html").attr("lang", "zh-cmn-Hans");
        // ----
        HtmlBuilder head = html.child("head");
        head.child("title").text(header.getTitle());
        head.child("meta").attr("charset", "utf-8");
        head.child("meta").attr("name", "generator").attr("content", _buildTime());
        for (ExternalStyleSheet x : header.getExternalStyleSheets()) {
            head.child("link").attr("rel", "stylesheet").attr("type", "text/css").attr("href", x.getHref());
        }
        // ----
        html.text(body.toHtml());
        return root.build();
    }

    private static String _buildTime() {
        return new SimpleDateFormat("yyyy.MM.dd hh:mm:ss.SSS").format(System.currentTimeMillis());
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

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}