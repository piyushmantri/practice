package com.practice.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Piyush M on 02-07-2016.
 */
public class MapExample {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        System.out.println(map.get("a"));
        map.put("a", 2);
        System.out.println(map.get("a"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("f"));
        for (Map.Entry e: map.entrySet()){
            System.out.println(e.getKey()+", "+e.getValue());
        }
    }
}
