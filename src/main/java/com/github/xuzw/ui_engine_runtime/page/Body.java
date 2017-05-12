package com.github.xuzw.ui_engine_runtime.page;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.annotation.StyleAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleBlockAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleDeclarationAnnotation;
import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.event.Event;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午9:50:51
 */
@StyleAnnotation({ //
        @StyleBlockAnnotation({ //
                @StyleDeclarationAnnotation(property = "font-family", value = "Verdana, Arial, '宋体'"), //
                @StyleDeclarationAnnotation(property = "margin", value = "0px"), //
                @StyleDeclarationAnnotation(property = "padding", value = "0px"), //
        }), })
public class Body extends Div {
    private Div body;

    @Override
    public Page execute(Event event) {
        return body.execute(event);
    }

    @Override
    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        build(root.child("body").id(getId()).cssClass(getClassName()));
        return root.build();
    }

    @Override
    protected void build(HtmlBuilder div) {
        div.text(body.toHtml());
    }

    public Div getBody() {
        return body;
    }

    public void setBody(Div body) {
        this.body = body;
    }
}