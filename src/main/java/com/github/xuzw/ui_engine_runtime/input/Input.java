package com.github.xuzw.ui_engine_runtime.input;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月15日 上午1:54:37
 */
public class Input {
    private String id;
    private String value;

    public Input() {
    }

    public Input(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
