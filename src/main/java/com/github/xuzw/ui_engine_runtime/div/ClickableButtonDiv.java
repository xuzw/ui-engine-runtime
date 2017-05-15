package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;
import com.github.xuzw.ui_engine_runtime.event.ClickEvent;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月14日 下午3:06:09
 */
public abstract class ClickableButtonDiv extends Div {
    private Class<? extends ClickEvent> clickEventClass;

    public ClickableButtonDiv(Class<? extends ClickEvent> clickEventClass) {
        this.clickEventClass = clickEventClass;
    }

    @Override
    protected void build(HtmlBuilder div) {
        buildButton(div.button().data("click-event-class", clickEventClass.getName()).cssClass(ClassName.of(ClickableButtonDiv.class)).onClick("UiEngine.click(this)"));
    }

    protected abstract void buildButton(HtmlBuilder button);
}
