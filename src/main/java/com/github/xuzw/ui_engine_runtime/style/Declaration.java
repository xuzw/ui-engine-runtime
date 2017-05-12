package com.github.xuzw.ui_engine_runtime.style;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月5日 上午11:59:43
 */
public class Declaration {
    private String property;
    private String value;

    public Declaration() {
    }

    public Declaration(String property, String value) {
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
