package com.lk.day08.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *  增强for遍历Map,不能直接遍历
 *  但是能间接遍历,Map集合遍历依靠Set集合
 */
public class MapDemo04 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("java",10000);
        map.put("c",12000);
        map.put("python",8000);

        //for间接遍历Map
        //Set<String> set = map.keySet();
        for (String s : map.keySet()){
           // Integer i = map.get(s);
            System.out.println(s+"::"+map.get(s));
        }
        System.out.println("-------------------------");
        //for间接遍历Map
       // Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
           // String key = entry.getKey();
            //Integer value = entry.getValue();
            System.out.println(entry.getKey()+"::"+entry.getValue());
        }
    }
}
