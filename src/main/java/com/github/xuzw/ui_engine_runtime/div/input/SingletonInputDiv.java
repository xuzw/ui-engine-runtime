package com.github.xuzw.ui_engine_runtime.div.input;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.SingletonDiv;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月14日 下午2:46:53
 */
public abstract class SingletonInputDiv extends SingletonDiv {
    @Override
    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        build(root.child("div").cssClass(getClassName()));
        return root.build();
    }

    @Override
    protected void build(HtmlBuilder div) {
        buildInput(div.input().id(getId()).cssClass(ClassName.of(SingletonInputDiv.class)));
    }

    protected void buildInput(HtmlBuilder input) {
    }
}
