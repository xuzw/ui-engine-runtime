package com.github.xuzw.ui_engine_runtime.page.popup;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.annotation.StyleAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleBlockAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleDeclarationAnnotation;
import com.github.xuzw.ui_engine_runtime.div.SingletonDiv;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月15日 上午12:25:53
 */
@StyleAnnotation({ //
        @StyleBlockAnnotation({ //
                @StyleDeclarationAnnotation(property = "display", value = "none"), //
                @StyleDeclarationAnnotation(property = "width", value = "100%"), //
                @StyleDeclarationAnnotation(property = "height", value = "100%"), //
                @StyleDeclarationAnnotation(property = "background", value = "rgba(0, 0, 0, 0.5)"), //
                @StyleDeclarationAnnotation(property = "position", value = "fixed"), //
                @StyleDeclarationAnnotation(property = "left", value = "0px"), //
                @StyleDeclarationAnnotation(property = "top", value = "0px"), //
                @StyleDeclarationAnnotation(property = "z-index", value = "1"), //
        }) })
public class PopupMaskDiv extends SingletonDiv {
    @Override
    protected void build(HtmlBuilder div) {
    }
}
