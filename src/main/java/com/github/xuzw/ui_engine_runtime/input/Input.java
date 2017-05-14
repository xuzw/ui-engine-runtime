package com.github.xuzw.ui_engine_runtime.input;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月15日 上午1:54:37
 */
public class Input {
    private String name;
    private String value;

    public Input() {
    }

    public Input(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
