package com.topjohnwu.magisk;

import com.topjohnwu.magisk.dummy.DummyReceiver;

import java.util.HashMap;
import java.util.Map;

/**
 * These are just some random class names hardcoded as an example.
 * For the actual release builds, these mappings will be auto generated.
 */
public class Mapping {

    private static final Map<String, String> map = new HashMap<>();
    public static final Map<String, Class<?>> internalMap = new HashMap<>();
    public static final Map<String, String> inverseMap;

    static {
        map.put("a.Q", "");
        map.put("f.u7", "nil.nadph.qnotified.activity.ConfigV2Activity");
        map.put("fxQ.lk", "com.topjohnwu.magisk.core.Provider");
        map.put("yy.E", "com.topjohnwu.magisk.core.Receiver");
        map.put("xt.R", "nil.nadph.qnotified.activity.ConfigV2ActivityAlias");
        map.put("lt5.a", "me.singleneuron.activity.QQPurifyAgentActivity");
        map.put("d.s", "nil.nadph.qnotified.activity.ConfigActivity");
        map.put("w.d", "me.ketal.ui.activity.QFileShareToIpadActivity");

        internalMap.put("a.Q", DelegateApplication.class);
        internalMap.put("f.u7", DownloadActivity.class);
        internalMap.put("fxQ.lk", FileProvider.class);
        internalMap.put("yy.E", DummyReceiver.class);

        inverseMap = new HashMap<>(map.size());
        for (Map.Entry<String, String> e : map.entrySet()) {
            inverseMap.put(e.getValue(), e.getKey());
        }
    }

    public static String get(String name) {
        String n = map.get(name);
        return n != null ? n : name;
    }
}
