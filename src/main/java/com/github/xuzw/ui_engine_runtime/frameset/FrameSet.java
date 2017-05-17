package com.github.xuzw.ui_engine_runtime.frameset;

import java.util.ArrayList;
import java.util.List;

import com.github.xuzw.html_builder.HtmlBuilder;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午12:47:53
 */
public abstract class FrameSet implements Element {
    private List<Element> elements = new ArrayList<>();
    private List<Scale> scales = new ArrayList<>();

    public FrameSet add(Element element, Scale scale) {
        elements.add(element);
        scales.add(scale);
        return this;
    }

    @Override
    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        HtmlBuilder frameset = root.child("frameset");
        buildFrameSet(frameset);
        for (Element element : elements) {
            frameset.text(element.toHtml());
        }
        return root.build();
    }

    protected abstract void buildFrameSet(HtmlBuilder frameset);

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public List<Scale> getScales() {
        return scales;
    }

    public void setScales(List<Scale> scales) {
        this.scales = scales;
    }
}
