package com.github.xuzw.ui_engine_runtime.script;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午9:37:51
 */
public class JQueryDocumentReadyCallback extends Script {
    private static final String format = "$(document).ready(function(){%s});";

    public JQueryDocumentReadyCallback(Script script) {
        super(String.format(format, script.toString()));
    }
}
