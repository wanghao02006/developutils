package com.leiyu.util;

import net.sf.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wh on 2017/6/14.
 */
public class BeanUtil {
    /**
     * bean转为Map
     * @param bean
     * @return
     */
    public static <T> Map<String, Object> beanToMap(T bean) {
        Map<String, Object> map = new HashMap<String, Object>();
        if(null != bean){
            BeanMap beanMap = BeanMap.create(bean);
            for(Object key : beanMap.keySet()){
                map.put(key + "", beanMap.get(key));
            }
        }

        return map;
    }

    /**
     * Map转为Bean
     * @param map
     * @param bean
     * @return
     */
    public static <T> T mapToBean(Map<String,Object> map,T bean){
        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }
}
