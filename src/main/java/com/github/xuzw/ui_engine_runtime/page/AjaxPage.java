package com.github.xuzw.ui_engine_runtime.page;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.script.Script;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月18日 上午10:10:53
 */
public class AjaxPage extends AbstractPage {
    private Div div;

    public AjaxPage(String name) {
        super(name);
    }

    @Override
    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        root.text(div.toHtml());
        for (Script x : getHeader().getScripts()) {
            root.child("script").attr("type", "text/javascript").text(x.toString());
        }
        return root.build();
    }

    @Override
    protected void build(HtmlBuilder html) {
    }

    public AjaxPage div(Div div) {
        setDiv(div);
        return this;
    }

    public Div getDiv() {
        return div;
    }

    public void setDiv(Div div) {
        this.div = div;
    }
}
