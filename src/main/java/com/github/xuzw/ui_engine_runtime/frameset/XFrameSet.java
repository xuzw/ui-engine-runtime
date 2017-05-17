package com.github.xuzw.ui_engine_runtime.frameset;

import org.apache.commons.lang3.StringUtils;

import com.github.xuzw.html_builder.HtmlBuilder;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月17日 下午12:53:34
 */
public class XFrameSet extends FrameSet {
    @Override
    protected void buildFrameSet(HtmlBuilder frameset) {
        frameset.attr("cols", StringUtils.join(getScales(), ","));
    }
}
