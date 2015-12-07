package com.michael.framework.helper;

import com.michael.framework.annotation.Inject;
import com.michael.framework.util.ArrayUtil;
import com.michael.framework.util.CollectionUtil;
import com.michael.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * helper class for inversion of control
 * Created by tanzy on 12/7/2015.
 */
public class IocHelper {
    static {
        //attain the map of class-instance pairs
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if(CollectionUtil.isNotEmpty(beanMap)) {
            //traverse the bean map
            for(Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                //get the bean class and instance separately
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                //get bean fields defined in the class
                Field[] fields = beanClass.getFields();
                if(ArrayUtil.isNotEmpty(fields)) {
                    //traverse the fields
                    for(Field beanField: fields) {
                        //see if the field has the @Inject annotation
                        if(beanField.isAnnotationPresent(Inject.class)) {
                            //link an instance to the field
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if(beanFieldInstance != null) {
                                //using reflection to initialize the field
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
