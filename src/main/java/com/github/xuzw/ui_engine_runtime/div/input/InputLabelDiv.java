package com.github.xuzw.ui_engine_runtime.div.input;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.Div;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月14日 下午2:55:12
 */
public abstract class InputLabelDiv extends Div {
    private SingletonInputDiv singletonInputDiv;

    public InputLabelDiv(SingletonInputDiv singletonInputDiv) {
        this.singletonInputDiv = singletonInputDiv;
    }

    @Override
    protected void build(HtmlBuilder div) {
        buildLabel(div.label().attr("for", singletonInputDiv.getId()));
    }

    protected abstract void buildLabel(HtmlBuilder label);
}
