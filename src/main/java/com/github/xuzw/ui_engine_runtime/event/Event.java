package com.github.xuzw.ui_engine_runtime.event;

import com.github.xuzw.ui_engine_runtime.div.location.Location;
import com.github.xuzw.ui_engine_runtime.input.Inputs;
import com.github.xuzw.ui_engine_runtime.page.AbstractPage;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:18:53
 */
public abstract class Event {
    private AbstractPage source;
    private Location location;
    private Inputs inputs;

    public abstract AbstractPage execute();

    public AbstractPage getSource() {
        return source;
    }

    public void setSource(AbstractPage source) {
        this.source = source;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }
}
