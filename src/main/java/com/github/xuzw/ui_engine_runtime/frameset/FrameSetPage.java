package com.github.xuzw.ui_engine_runtime.frameset;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.page.AbstractPage;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午1:38:17
 */
public class FrameSetPage extends AbstractPage {
    private FrameSet frameSet;

    public FrameSetPage(String name) {
        super(name);
    }

    @Override
    protected void build(HtmlBuilder html) {
        html.text(frameSet.toHtml());
    }

    public FrameSet getFrameSet() {
        return frameSet;
    }

    public void setFrameSet(FrameSet frameSet) {
        this.frameSet = frameSet;
    }
}
