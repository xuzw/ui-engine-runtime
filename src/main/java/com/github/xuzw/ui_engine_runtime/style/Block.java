package com.github.xuzw.ui_engine_runtime.style;

import java.util.List;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月5日 下午12:15:03
 */
public class Block {
    private String selector;
    private List<Declaration> declarations;

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<Declaration> declarations) {
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(".").append(selector).append(" {\n");
        for (Declaration declaration : declarations) {
            sb.append(declaration.getProperty()).append(": ").append(declaration.getValue()).append(";\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
