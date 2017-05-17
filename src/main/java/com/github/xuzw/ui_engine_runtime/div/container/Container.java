package com.github.xuzw.ui_engine_runtime.div.container;

import java.util.ArrayList;
import java.util.List;

import com.github.xuzw.ui_engine_runtime.div.Div;
import com.github.xuzw.ui_engine_runtime.div.location.Location;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月11日 上午10:29:53
 */
public abstract class Container extends Div {
    private List<Div> elements = new ArrayList<>();

    public int size() {
        return elements.size();
    }

    public Div get(int index) {
        return elements.get(index);
    }

    public Div remove(int index) {
        return elements.remove(index);
    }

    public boolean remove(Div element) {
        return elements.remove(element);
    }

    public Container set(int index, Div element) {
        elements.set(index, element);
        return this;
    }

    @Override
    public Div get(Location location) {
        if (this.is(location)) {
            return this;
        }
        for (Div element : elements) {
            if (element.is(location)) {
                return element;
            }
        }
        for (Container childContainer : getChildContainers()) {
            Div div = childContainer.get(location);
            if (div != null) {
                return div;
            }
        }
        return null;
    }

    public Container add(Div element) {
        elements.add(element);
        return this;
    }

    public List<Div> getElements() {
        return elements;
    }

    public List<Container> getChildContainers() {
        List<Container> childContainers = new ArrayList<>();
        for (Div element : elements) {
            if (element instanceof Container) {
                childContainers.add((Container) element);
            }
        }
        return childContainers;
    }
}
