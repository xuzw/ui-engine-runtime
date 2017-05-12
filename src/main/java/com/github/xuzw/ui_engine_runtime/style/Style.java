package com.github.xuzw.ui_engine_runtime.style;

import java.util.List;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月5日 上午11:58:09
 */
public class Style {
    private List<Block> blocks;

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Block block : blocks) {
            sb.append(block.toString()).append("\n");
        }
        return sb.toString();
    }
}
