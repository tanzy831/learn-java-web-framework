package com.michael.framework.bean;

import com.michael.framework.util.CastUtil;

import java.util.Map;

/**
 * Created by tanzy on 1/25/2016.
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * get Long value according to name
     * @param name
     * @return
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * get all the param values
     * @return
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}

