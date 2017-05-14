package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月14日 下午3:06:09
 */
public abstract class ButtonDiv extends Div {

    @Override
    protected void build(HtmlBuilder div) {
        buildButton(div.button().cssClass(ClassName.of(ButtonDiv.class)).onClick("UiEngine.click(this)"));
    }

    protected abstract void buildButton(HtmlBuilder button);
}
