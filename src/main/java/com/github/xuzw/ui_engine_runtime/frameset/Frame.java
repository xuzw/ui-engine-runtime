package com.github.xuzw.ui_engine_runtime.frameset;

import org.apache.commons.lang3.StringUtils;

import com.github.xuzw.html_builder.HtmlBuilder;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午12:48:09
 */
public class Frame implements Element {
    private String src;
    private String name;

    public Frame() {
    }

    public Frame(String src) {
        this.src = src;
    }

    public Frame(String src, String name) {
        this.src = src;
        this.name = name;
    }

    @Override
    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        HtmlBuilder frame = root.child("frame").src(src).attr("frameborder", "0").attr("noresize", "noresize");
        if (StringUtils.isNoneBlank(name)) {
            frame.attr("name", name);
        }
        return root.build();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
