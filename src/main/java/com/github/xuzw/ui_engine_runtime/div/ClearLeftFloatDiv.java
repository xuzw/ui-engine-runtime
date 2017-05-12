package com.github.xuzw.ui_engine_runtime.div;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.annotation.StyleAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleBlockAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleDeclarationAnnotation;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月12日 下午1:15:56
 */
@StyleAnnotation({ //
        @StyleBlockAnnotation({ //
                @StyleDeclarationAnnotation(property = "clear", value = "left"), //
        }) })
public class ClearLeftFloatDiv extends Div {
    public static ClearLeftFloatDiv instance = new ClearLeftFloatDiv();

    @Override
    protected void build(HtmlBuilder div) {
    }
}
