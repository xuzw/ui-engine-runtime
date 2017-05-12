package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;
import com.github.xuzw.ui_engine_runtime.div.location.Id;
import com.github.xuzw.ui_engine_runtime.event.Event;
import com.github.xuzw.ui_engine_runtime.page.Page;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:02:50
 */
public abstract class Div {
    private Page page;

    public Page execute(Event event) {
        return null;
    }

    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        build(root.child("div").id(getId()).cssClass(getClassName()));
        return root.build();
    }

    protected abstract void build(HtmlBuilder div);

    public String getClassName() {
        return ClassName.of(getClass());
    }

    public String getId() {
        return Id.of(this);
    }

    public boolean is(String className, String id) {
        return getClassName().equals(className) && getId().equals(id);
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}