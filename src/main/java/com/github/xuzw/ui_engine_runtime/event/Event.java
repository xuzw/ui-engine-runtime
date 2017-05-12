package com.github.xuzw.ui_engine_runtime.event;

import com.github.xuzw.ui_engine_runtime.div.location.Location;
import com.github.xuzw.ui_engine_runtime.page.Page;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:18:53
 */
public abstract class Event {
    private Page page;
    private Location location;

    public abstract Page execute();

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
