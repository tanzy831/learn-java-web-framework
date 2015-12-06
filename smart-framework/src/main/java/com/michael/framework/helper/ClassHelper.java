package com.michael.framework.helper;

import com.michael.framework.annotation.Controller;
import com.michael.framework.annotation.Service;
import com.michael.framework.util.ClassUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tanzy on 12/4/2015.
 */
public final class ClassHelper {
    /**
     * class set that stores all the loaded classes
     */
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * attain all class under the base package
     * @return
     */
    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    /**
     * return set of classes with annotation "Service"
     * @return
     */
    public static Set<Class<?>> getServiceClassSet() {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for(Class<?> cls: CLASS_SET) {
            if(cls.isAnnotationPresent(Service.class)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * return set of classes with annotation "Controller"
     * @return
     */
    public static Set<Class<?>> getControllerClassSet() {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for(Class<?> cls: CLASS_SET) {
            if(cls.isAnnotationPresent(Controller.class)) {
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * return set of bean classes,
     * these classes have annotation "Service" or "Controller"
     * @return
     */
    public static Set<Class<?>> getBeanClassSet() {
        Set<Class<?>> beanClassSet = new HashSet<Class<?>>();
        beanClassSet.addAll(getServiceClassSet());
        beanClassSet.addAll(getControllerClassSet());
        return beanClassSet;
    }
}
