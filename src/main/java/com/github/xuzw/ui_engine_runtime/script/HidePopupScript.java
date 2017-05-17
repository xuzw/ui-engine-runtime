package com.github.xuzw.ui_engine_runtime.script;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午9:29:43
 */
public class HidePopupScript extends Script {
    private static final String format = "UiEngine.hidePopup('%s');";

    public HidePopupScript(String id) {
        super(String.format(format, id));
    }
}
