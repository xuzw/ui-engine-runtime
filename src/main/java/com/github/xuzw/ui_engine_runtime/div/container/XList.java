package com.github.xuzw.ui_engine_runtime.div.container;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.annotation.StyleAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleBlockAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleDeclarationAnnotation;
import com.github.xuzw.ui_engine_runtime.div.ClearLeftFloatDiv;
import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:29:04
 */
@StyleAnnotation({ //
        @StyleBlockAnnotation({ //
                @StyleDeclarationAnnotation(property = "list-style-type", value = "none"), //
                @StyleDeclarationAnnotation(property = "margin", value = "0px"), //
                @StyleDeclarationAnnotation(property = "padding", value = "0px"), //
        }), @StyleBlockAnnotation(selector = ">li", value = { //
                @StyleDeclarationAnnotation(property = "float", value = "left"), //
        }), })
public class XList extends Container {

    @Override
    protected void build(HtmlBuilder div) {
        HtmlBuilder ul = div.child("ul").cssClass(ClassName.of(XList.class));
        for (Div element : getElements()) {
            ul.child("li").text(element.toHtml());
        }
        div.text(ClearLeftFloatDiv.instance.toHtml());
    }
}
