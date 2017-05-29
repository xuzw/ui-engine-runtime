package com.github.xuzw.ui_engine_runtime.page;

import java.util.List;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.script.ExternalScript;
import com.github.xuzw.ui_engine_runtime.style.ExternalStyleSheet;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午9:48:11
 */
public class Page extends AbstractPage {
    private Body body;

    public Page(String name) {
        super(name);
    }

    @Override
    protected void build(HtmlBuilder html) {
        html.text(body.toHtml());
    }

    @Override
    public Page title(String title) {
        return (Page) super.title(title);
    }

    @Override
    public Page externalScripts(List<ExternalScript> externalScripts) {
        return (Page) super.externalScripts(externalScripts);
    }

    @Override
    public Page externalStyleSheets(List<ExternalStyleSheet> externalStyleSheets) {
        return (Page) super.externalStyleSheets(externalStyleSheets);
    }

    public Page body(Div body) {
        setBody(new Body(body));
        return this;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
