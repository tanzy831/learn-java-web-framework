package com.michael.framework.bean;

import java.lang.reflect.Method;

/**
 * Created by tanzy on 12/7/2015.
 */
public class Handler {
    /**
     * the class type of the controller
     */
    private Class<?> controllerClass;
    /**
     * the method to be called upon
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
