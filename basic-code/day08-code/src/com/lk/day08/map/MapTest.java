package com.lk.day08.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        String str = "sdfsssADGW616197";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] chs = str.toCharArray();
        for(char ch : chs){
            Integer value = map.get(ch);
            if(value == null){
                map.put(ch,1);
            }else{
                value++;
                map.put(ch,value);
            }
        }
        //键值对方式遍历
        //Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entries : map.entrySet()){
            System.out.println(entries.getKey()+"字符出现的次数"+entries.getValue());
        }
        System.out.println("--------------------------------");
        //键找值方式遍历
       // Set<Character> set = map.keySet();
        for (char ch : map.keySet()){
            System.out.println(ch+"字符出现的次数"+map.get(ch));
        }
    }
}
