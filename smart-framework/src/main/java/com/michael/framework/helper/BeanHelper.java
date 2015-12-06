package com.michael.framework.helper;

import com.michael.framework.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by tanzy on 12/6/2015.
 */
public class BeanHelper {
    /**
     * A map storing all the classes in package
     * paired with matching instances
     */
    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    /**
     * initializing BEAN_MAP
     */
    static {
        Set<Class<? >> beanClassSet = ClassHelper.getBeanClassSet();
        for(Class<?> cls: beanClassSet) {
            Object obj = ReflectionUtil.newInstance(cls);
            BEAN_MAP.put(cls, obj);
        }
    }

    /**
     * get bean map
     * @return
     */
    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    /**
     * get bean instance
     * @param cls
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> cls) {
        if(!BEAN_MAP.containsKey(cls)) {
            throw new RuntimeException("cannot get bean by class: " + cls);
        }
        return (T) BEAN_MAP.get(cls);
    }
}
