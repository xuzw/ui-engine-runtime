package com.github.xuzw.ui_engine_runtime.div.location;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午11:16:28
 */
public class Location {
    private String className;
    private String id;

    public Location() {
    }

    public Location(String className, String id) {
        this.className = className;
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
