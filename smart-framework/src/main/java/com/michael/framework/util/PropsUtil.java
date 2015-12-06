package com.michael.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * util class used for .properties files loading and properties extraction
 * Created by tanzy on 11/19/2015.
 */
public final class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * load property files
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName){
        Properties props = null;
        InputStream is = null;
        try{
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(is == null){
                throw new FileNotFoundException(fileName + "file not found");
            }
            props = new Properties();
            props.load(is);
        }catch (IOException e){
            LOGGER.error("load properties file failure", e);
        }finally {
            if(is != null){
                try{
                    is.close();
                }catch (IOException e){
                    LOGGER.error("close input stream failure",e);
                }
            }
        }
        return props;
    }

    /**
     * get properties of string type (default value "")
     * @param props
     * @param key
     * @return
     */
    public static String getString(Properties props, String key){
        return getString(props,key,"");
    }

    /**
     * get properties of string type (with default value)
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getString(Properties props, String key, String defaultValue){
        String value = defaultValue;
        if(props.containsKey(key)){
            value=props.getProperty(key);
        }
        return value;
    }

    /**
     * get properties of int type (default value 0)
     * @param props
     * @param key
     * @return
     */
    public static int getInt(Properties props, String key){
        return getInt(props,key,0);
    }

    /**
     * get properties of int type (with default value)
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static int getInt(Properties props, String key, int defaultValue){
        int value = defaultValue;
        if(props.containsKey(key)){
            value = CastUtil.castInt(props.getProperty(key));
        }
        return value;
    }

    /**
     * get properties of boolean type (with default value false)
     * @param props
     * @param key
     * @return
     */
    public static boolean getBoolean(Properties props, String key){
        return getBoolean(props,key,false);
    }

    /**
     * get properties of boolean type (with default value)
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static boolean getBoolean(Properties props, String key, boolean defaultValue){
        boolean value = defaultValue;
        if(props.containsKey(key)){
            value = CastUtil.castBoolean(props.getProperty(key));
        }
        return value;
    }
}
