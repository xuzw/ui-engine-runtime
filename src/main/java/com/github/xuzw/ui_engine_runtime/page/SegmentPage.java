package com.github.xuzw.ui_engine_runtime.page;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.Div;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月30日 下午1:59:35
 */
public class SegmentPage extends AbstractPage {
    private Div div;

    public SegmentPage(String name) {
        super(name);
    }

    public SegmentPage(Div div) {
        super(PageName.of(div.getClass()));
        this.div = div;
    }

    @Override
    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        root.text(String.format("<!-- GenerateBy %s %s -->", getClass().getName(), buildTime()));
        root.text(div.toHtml());
        return root.build();
    }

    @Override
    protected void build(HtmlBuilder html) {
    }

    public SegmentPage div(Div div) {
        this.div = div;
        return this;
    }

    public Div getDiv() {
        return div;
    }

    public void setDiv(Div div) {
        this.div = div;
    }
}
