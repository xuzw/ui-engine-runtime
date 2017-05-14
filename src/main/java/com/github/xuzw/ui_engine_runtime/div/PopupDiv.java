package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.annotation.StyleAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleBlockAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleDeclarationAnnotation;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月15日 上午12:30:07
 */
@StyleAnnotation({ //
        @StyleBlockAnnotation({ //
                @StyleDeclarationAnnotation(property = "background", value = "#fff"), //
                @StyleDeclarationAnnotation(property = "position", value = "fixed"), //
                @StyleDeclarationAnnotation(property = "left", value = "50%"), //
                @StyleDeclarationAnnotation(property = "top", value = "50%"), //
                @StyleDeclarationAnnotation(property = "z-index", value = "2"), //
                @StyleDeclarationAnnotation(property = "transform", value = "translate(-50%, -50%)"), //
        }) })
public final class PopupDiv extends Div {
    private Div div;

    public PopupDiv(Div div) {
        this.div = div;
    }

    @Override
    protected void build(HtmlBuilder div) {
        div.text(this.div.toHtml());
    }
}
