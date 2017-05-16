package com.github.xuzw.ui_engine_runtime.page.builder;

import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.page.Body;
import com.github.xuzw.ui_engine_runtime.page.Header;
import com.github.xuzw.ui_engine_runtime.page.Page;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 下午1:38:19
 */
public class PageBuilder {
    private Page page = new Page();
    private Header header = new Header();
    private Body body = new Body();

    public PageBuilder(String title) {
        header.setTitle(title);
        page.setHeader(header);
        page.setBody(body);
    }

    public PageBuilder body(Div body) {
        this.body.setBody(body);
        return this;
    }

    public Page build() {
        return page;
    }
}
