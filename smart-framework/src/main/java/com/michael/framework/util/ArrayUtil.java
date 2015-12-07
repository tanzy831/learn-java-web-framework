package com.michael.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * util class for array usage
 * Created by tanzy on 12/7/2015.
 */
public class ArrayUtil {

    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(Object[] array) {
        return !isEmpty(array);
    }
}
