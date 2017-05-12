package com.github.xuzw.ui_engine_runtime.page;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:55:36
 */
public class ErrorPage extends Page {
    private Throwable throwable;

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
