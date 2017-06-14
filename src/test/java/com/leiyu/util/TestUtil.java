package com.leiyu.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wh on 2017/6/14.
 */
public class TestUtil {

    Person p = new Person();

    @Before
    public void init(){
        p.setName("wh");
        p.setUsername("leiyu");
    }

    @Test
    public void testbeanToMap(){
        Map<String,Object> map = BeanUtil.beanToMap(p);
        assertEquals("wh",map.get("name"));
    }

    @Test
    public void testMapToBean(){
        Person p1 = new Person();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","wh");
        map.put("username","leiyu");
        BeanUtil.mapToBean(map,p1);
        assertEquals("wh",p1.getName());
    }

    class Person{
        private String name;

        private String username;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
