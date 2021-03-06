package com.michael.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tanzy on 1/27/2016.
 */
public class View {
    /**
     * path of the view
     */
    private String path;
    /**
     * data model
     */
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        this.model = new HashMap<String, Object>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
