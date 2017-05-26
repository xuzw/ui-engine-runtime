package com.github.xuzw.ui_engine_runtime.div.wrapper;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.Div;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月26日 下午1:44:27
 */
public class Label extends Wrapper {
    private String forInputId;

    public Label(String forInputId, Div element) {
        super(element);
        this.forInputId = forInputId;
    }

    @Override
    protected void build(HtmlBuilder div) {
        div.label().attr("for", forInputId).text(getElement().toHtml());
    }
}
