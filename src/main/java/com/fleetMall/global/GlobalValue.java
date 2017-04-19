package com.fleetMall.global;

import com.fleetMall.model.Boss;

import java.util.concurrent.ConcurrentMap;

/**
 * Created by beila on 2017/4/18.
 */
public class GlobalValue {

    private ConcurrentMap<Object, Object> globalMap;

    private static GlobalValue instance = null;

    private GlobalValue() {

    }

    public static GlobalValue getInstance() {
        if (instance == null) {
            synchronized (GlobalValue.class) {
                if (instance == null) {
                    instance = new GlobalValue();
                }
            }
        }
        return instance;
    }

    public Object getAttribute(Object key) {
        return globalMap.get(key);
    }

    public boolean setAttribute(Object key, Object value) {
        try {
            globalMap.put(key, value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
