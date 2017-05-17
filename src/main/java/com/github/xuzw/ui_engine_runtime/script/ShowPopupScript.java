package com.github.xuzw.ui_engine_runtime.script;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午9:19:18
 */
public class ShowPopupScript extends Script {
    private static final String format = "UiEngine.showPopup('%s');";

    public ShowPopupScript(String id) {
        super(String.format(format, id));
    }
}
