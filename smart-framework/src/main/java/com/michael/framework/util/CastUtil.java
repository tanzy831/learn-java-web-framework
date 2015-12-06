package com.michael.framework.util;

/**
 * util class for casting
 * Created by tanzy on 11/19/2015.
 */
public final class CastUtil {

    /**
     * cast object to string with default value ""
     * @param obj
     * @return
     */
    public static String castString(Object obj){
        return castString(obj,"");
    }

    /**
     * cast object to string with default value
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj, String defaultValue){
        return obj != null ? String.valueOf(obj) : defaultValue;
    }


    /**
     * cast object to int with default value 0
     * @param obj
     * @return
     */
    public static int castInt(Object obj){
        return castInt(obj,0);
    }

    /**
     * cast object to int with default value
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castInt(Object obj, int defaultValue){
        int value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Integer.parseInt(strValue);
                }catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }


    /**
     * cast object to long with default value 0
     * @param obj
     * @return
     */
    public static long castLong(Object obj){
        return castLong(obj,0);
    }

    /**
     * cast object to long with default value
     * @param obj
     * @param defaultValue
     * @return
     */
    public static long castLong(Object obj, long defaultValue){
        long value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Long.parseLong(strValue);
                }catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }


    /**
     * cast object to double with default value 0
     * @param obj
     * @return
     */
    public static double castDouble(Object obj){
        return castDouble(obj,0);
    }

    /**
     * cast object to double with default value
     * @param obj
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object obj, double defaultValue){
        double value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Double.parseDouble(strValue);
                }catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }


    /**
     * cast object to boolean with default value false
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj){
        return castBoolean(obj,false);
    }

    /**
     * cast object to boolean with a default value
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj, boolean defaultValue){
        boolean value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Boolean.parseBoolean(strValue);
                }catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }
}
