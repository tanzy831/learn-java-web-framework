package org.michael.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * util class for string related operations
 * Created by tanzy on 11/19/2015.
 */
public final class StringUtil {
    /**
     * determine if a string is empty
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * determine if a string is not empty
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return ! isEmpty(str);
    }
}
