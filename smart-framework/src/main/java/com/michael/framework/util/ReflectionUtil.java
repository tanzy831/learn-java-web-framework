package com.michael.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * util class involving java reflection
 * Created by tanzy on 12/6/2015.
 */
public class ReflectionUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    /**
     * create and return new instance of the given class
     * @param cls
     * @return
     */
    public static Object newInstance(Class<?> cls) {
        Object instance;
        try {
            instance = cls.newInstance();
        } catch (Exception e) {
            LOGGER.error("creating new instance failure", e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    /**
     * invoke the given method upon the given object
     * @param obj
     * @param method
     * @param args
     * @return
     */
    public static Object invokeMethod(Object obj, Method method, Object ... args) {
        Object result;
        try {
           result = method.invoke(obj, args);
        } catch (Exception e) {
            LOGGER.error("invoking method failure", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * set the value of the given field
     * @param obj
     * @param field
     * @param value
     */
    public static void setField(Object obj, Field field, Object value) {
        try {
            //if do not set accessible, then will cause exception
            field.setAccessible(true);
            setField(obj, field, true);
        } catch (Exception e) {
            LOGGER.error("set field failure", e);;
            throw new RuntimeException(e);
        }
    }
}
