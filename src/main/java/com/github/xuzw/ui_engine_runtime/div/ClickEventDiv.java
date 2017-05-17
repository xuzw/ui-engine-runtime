package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;
import com.github.xuzw.ui_engine_runtime.event.ClickEvent;
import com.github.xuzw.ui_engine_runtime.script.ClickScript;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月16日 下午2:28:24
 */
public abstract class ClickEventDiv extends Div {
    private Class<? extends ClickEvent> clickEventClass;

    public ClickEventDiv(Class<? extends ClickEvent> clickEventClass) {
        this.clickEventClass = clickEventClass;
    }

    @Override
    protected void build(HtmlBuilder div) {
        buildClickEventDiv(div.child("div").data("click-event-class", clickEventClass.getName()).cssClass(ClassName.of(ClickEventDiv.class)).onClick(ClickScript.text));
    }

    protected abstract void buildClickEventDiv(HtmlBuilder clickEventDiv);
}
