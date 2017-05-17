package com.github.xuzw.ui_engine_runtime.frameset;

import java.util.List;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.page.AbstractPage;
import com.github.xuzw.ui_engine_runtime.script.ExternalScript;
import com.github.xuzw.ui_engine_runtime.script.Script;
import com.github.xuzw.ui_engine_runtime.style.ExternalStyleSheet;

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

    public FrameSetPage frameSet(FrameSet frameSet) {
        setFrameSet(frameSet);
        return this;
    }

    @Override
    public FrameSetPage title(String title) {
        return (FrameSetPage) super.title(title);
    }

    @Override
    public FrameSetPage scripts(List<Script> scripts) {
        return (FrameSetPage) super.scripts(scripts);
    }

    @Override
    public FrameSetPage externalScripts(List<ExternalScript> externalScripts) {
        return (FrameSetPage) super.externalScripts(externalScripts);
    }

    @Override
    public FrameSetPage externalStyleSheets(List<ExternalStyleSheet> externalStyleSheets) {
        return (FrameSetPage) super.externalStyleSheets(externalStyleSheets);
    }

    public FrameSet getFrameSet() {
        return frameSet;
    }

    public void setFrameSet(FrameSet frameSet) {
        this.frameSet = frameSet;
    }
}
