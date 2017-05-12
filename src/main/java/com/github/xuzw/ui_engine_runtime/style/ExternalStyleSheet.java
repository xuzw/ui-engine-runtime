package com.github.xuzw.ui_engine_runtime.style;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月8日 上午10:46:14
 */
public class ExternalStyleSheet {
    private String href;

    public ExternalStyleSheet() {
    }

    public ExternalStyleSheet(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
