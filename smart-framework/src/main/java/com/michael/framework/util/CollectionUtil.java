package com.michael.framework.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * util class for collection related operations
 * Created by tanzy on 11/19/2015.
 */
public final class CollectionUtil {

    /**
     * see if collection is empty
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection){
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * see if collection is not empty
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return ! isEmpty(collection);
    }

    /**
     * see if a map is empty
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?,?> map){
        return MapUtils.isEmpty(map);
    }

    /**
     * see if a map is not empty
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map<?,?> map){
        return !isEmpty(map);
    }
}
