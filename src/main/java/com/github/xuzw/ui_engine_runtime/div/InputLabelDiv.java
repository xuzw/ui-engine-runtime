package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月14日 下午2:55:12
 */
public abstract class InputLabelDiv extends Div {
    private InputDiv inputDiv;

    public InputLabelDiv(InputDiv inputDiv) {
        this.inputDiv = inputDiv;
    }

    @Override
    protected void build(HtmlBuilder div) {
        buildLabel(div.label().attr("for", inputDiv.getInputId()));
    }

    protected abstract void buildLabel(HtmlBuilder label);
}
