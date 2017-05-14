package com.github.xuzw.ui_engine_runtime.input;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.github.xuzw.ui_engine_runtime.div.InputDiv;
import com.github.xuzw.ui_engine_runtime.div.location.ClassName;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月15日 上午1:58:00
 */
public class Inputs {
    private Map<String, Input> map = new HashMap<>();

    public void put(String name, String value) {
        map.put(name, new Input(name, value));
    }

    public Optional<Input> get(String name) {
        return Optional.ofNullable(map.get(name));
    }

    public Optional<Input> get(Class<? extends InputDiv> inputClass) {
        return Optional.ofNullable(map.get(ClassName.of(inputClass)));
    }
}
