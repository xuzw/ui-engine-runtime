package com.github.xuzw.ui_engine_runtime.input;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.github.xuzw.ui_engine_runtime.div.input.SingletonInputDiv;
import com.github.xuzw.ui_engine_runtime.div.location.Id;

/**
 * @author 徐泽威 xuzewei_2012@126.com
 * @time 2017年5月15日 上午1:58:00
 */
public class Inputs {
    private Map<String, Input> map = new HashMap<>();

    public void put(String id, String value) {
        map.put(id, new Input(id, value));
    }

    public Optional<Input> get(String id) {
        return Optional.ofNullable(map.get(id));
    }

    public Optional<Input> get(Class<? extends SingletonInputDiv> clz) {
        return get(Id.of(clz));
    }
}
