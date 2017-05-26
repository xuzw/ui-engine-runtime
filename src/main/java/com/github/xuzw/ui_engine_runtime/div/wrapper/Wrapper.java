package com.github.xuzw.ui_engine_runtime.div.wrapper;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.div.location.Location;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月16日 上午12:21:04
 */
public abstract class Wrapper extends Div {
    private Div element;

    public Wrapper(Div element) {
        this.element = element;
    }

    @Override
    protected void build(HtmlBuilder div) {
        div.text(element.toHtml());
    }

    @Override
    public Div get(Location location) {
        if (this.is(location)) {
            return this;
        }
        return element.get(location);
    }

    public Div getElement() {
        return element;
    }
}
