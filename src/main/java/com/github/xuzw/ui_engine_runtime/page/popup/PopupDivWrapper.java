package com.github.xuzw.ui_engine_runtime.page.popup;

import com.github.xuzw.ui_engine_runtime.annotation.StyleAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleBlockAnnotation;
import com.github.xuzw.ui_engine_runtime.annotation.StyleDeclarationAnnotation;
import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.div.wrapper.Wrapper;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月15日 上午12:30:07
 */
@StyleAnnotation({ //
        @StyleBlockAnnotation({ //
                @StyleDeclarationAnnotation(property = "display", value = "none"), //
                @StyleDeclarationAnnotation(property = "background", value = "#fff"), //
                @StyleDeclarationAnnotation(property = "position", value = "fixed"), //
                @StyleDeclarationAnnotation(property = "left", value = "50%"), //
                @StyleDeclarationAnnotation(property = "top", value = "50%"), //
                @StyleDeclarationAnnotation(property = "z-index", value = "2"), //
                @StyleDeclarationAnnotation(property = "transform", value = "translate(-50%, -50%)"), //
        }) })
public final class PopupDivWrapper extends Wrapper {
    private String id;

    public PopupDivWrapper(String id, Div element) {
        super(element);
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
