package com.michael.framework;

import com.michael.framework.helper.BeanHelper;
import com.michael.framework.helper.ClassHelper;
import com.michael.framework.helper.ControllerHelper;
import com.michael.framework.helper.IocHelper;
import com.michael.framework.util.ClassUtil;

/**
 * initialize the helper classes (static part of code)
 * including ClassHelper, BeanHelper, IocHelper, ControllerHelper
 * Created by tanzy on 12/8/2015.
 */
public class LoaderHelper {
    public static void init() {
        Class<?> [] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls: classList) {
            ClassUtil.loadClass(cls.getName(),false);
        }
    }
}
