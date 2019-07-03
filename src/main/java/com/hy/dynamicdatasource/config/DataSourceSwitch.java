package com.hy.dynamicdatasource.config;

/**
 * User: HY
 * Date: 2019/7/2
 * Time: 17:48
 * Description:
 */
public class DataSourceSwitch {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();


    public static String getDataSourceKey(){
        return threadLocal.get();
    }

    public static void setDataSourceKey(String key){
        threadLocal.set(key);
    }
}
