package com.github.xuzw.ui_engine_runtime.div.container;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.annotation.StyleAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleBlockAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleDeclarationAnnotation;
import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:48:27
 */
@StyleAnnotation({ //
        @StyleBlockAnnotation({ //
                @StyleDeclarationAnnotation(property = "list-style-type", value = "none"), //
                @StyleDeclarationAnnotation(property = "margin", value = "0px"), //
                @StyleDeclarationAnnotation(property = "padding", value = "0px"), //
        }), })
public class YList extends Container {

    @Override
    protected void build(HtmlBuilder div) {
        HtmlBuilder ul = div.child("ul").cssClass(ClassName.of(YList.class));
        for (Div element : getElements()) {
            ul.child("li").text(element.toHtml());
        }
    }
}
