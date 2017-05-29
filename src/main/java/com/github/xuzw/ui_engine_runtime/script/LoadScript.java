package com.github.xuzw.ui_engine_runtime.script;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月18日 上午10:50:52
 */
public class LoadScript extends Script {
    private static final String format = "UiEngine.loadScript('%s');";

    public LoadScript(String url) {
        super(String.format(format, url));
    }
}
