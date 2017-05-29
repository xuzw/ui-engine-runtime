package com.github.xuzw.ui_engine_runtime.page.popup;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.div.container.Container;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午3:44:11
 */
public class PopupContainer extends Container {

    public PopupContainer() {
        add(new PopupMaskDiv());
    }

    public PopupContainer add(String id, Div popup) {
        Div oldPopup = null;
        for (Div element : getElements()) {
            if (id.equals(element.getId())) {
                oldPopup = element;
            }
        }
        if (oldPopup != null) {
            remove(oldPopup);
        }
        add(new PopupDivWrapper(id, popup));
        return this;
    }

    @Override
    protected void build(HtmlBuilder div) {
        for (Div element : getElements()) {
            div.text(element.toHtml());
        }
    }
}
