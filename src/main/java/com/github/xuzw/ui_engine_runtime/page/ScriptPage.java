package com.github.xuzw.ui_engine_runtime.page;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.github.xuzw.html_builder.HtmlBuilder;
import com.github.xuzw.ui_engine_runtime.input.Inputs;
import com.github.xuzw.ui_engine_runtime.script.Script;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月18日 上午10:10:53
 */
public class ScriptPage extends AbstractPage {
    private List<Script> scripts = new ArrayList<>();

    public ScriptPage(String name) {
        super(name);
    }

    @Override
    public AbstractPage filter(Inputs inputs) {
        clearScript();
        return super.filter(inputs);
    }

    @Override
    public String toHtml() {
        HtmlBuilder root = new HtmlBuilder();
        HtmlBuilder script = root.child("script").attr("type", "text/javascript");
        script.text(String.format("/* GenerateBy %s %s */", getClass().getName(), _buildTime()));
        for (Script x : scripts) {
            script.text(x.toString());
        }
        return root.build();
    }

    private static String _buildTime() {
        return new SimpleDateFormat("yyyy.MM.dd hh:mm:ss.SSS").format(System.currentTimeMillis());
    }

    @Override
    protected void build(HtmlBuilder html) {
    }

    public void clearScript() {
        scripts.clear();
    }

    public void addScript(Script script) {
        scripts.add(script);
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }

    public List<Script> getScripts() {
        return scripts;
    }
}
