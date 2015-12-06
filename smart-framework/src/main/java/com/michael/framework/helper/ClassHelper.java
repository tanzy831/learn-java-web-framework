package com.michael.framework.helper;

        import com.michael.framework.util.ClassUtil;

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
}
