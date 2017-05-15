package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月14日 下午2:46:53
 */
public abstract class InputDiv extends Div {
    private String inputId;

    public InputDiv(String inputId) {
        this.inputId = inputId;
    }

    @Override
    protected void build(HtmlBuilder div) {
        buildInput(div.input().id(inputId).cssClass(ClassName.of(InputDiv.class)));
    }

    protected void buildInput(HtmlBuilder input) {
    }

    public String getInputId() {
        return inputId;
    }
}
