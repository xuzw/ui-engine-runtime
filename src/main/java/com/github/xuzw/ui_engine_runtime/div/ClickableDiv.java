package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;
import com.github.xuzw.ui_engine_runtime.event.ClickEvent;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月16日 下午2:28:24
 */
public abstract class ClickableDiv extends Div {
    private Class<? extends ClickEvent> clickEventClass;

    public ClickableDiv(Class<? extends ClickEvent> clickEventClass) {
        this.clickEventClass = clickEventClass;
    }

    @Override
    protected void build(HtmlBuilder div) {
        buildClickableDiv(div.child("div").data("click-event-class", clickEventClass.getName()).cssClass(ClassName.of(ClickableDiv.class)).onClick("UiEngine.click(this)"));
    }

    protected abstract void buildClickableDiv(HtmlBuilder clickableDiv);
}
