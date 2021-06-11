package ua.lviv.lgs.lesson15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("HP",1102);
        linkedHashMap.put("LG",709);
        linkedHashMap.put("Medion",15);
        linkedHashMap.put("Philips",40);
        linkedHashMap.put("Iphone",3);
        System.out.println(linkedHashMap);
        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        for (Map.Entry<String, Integer> set : entries){
            System.out.println(set);
        }

        System.out.println("hashMap.get(\"HP\") "+ linkedHashMap.get("HP"));
        System.out.println("hashMap.containsKey(\"LG\") "+linkedHashMap.containsKey("LG"));
        System.out.println(linkedHashMap.containsValue(1102));
        System.out.println(linkedHashMap.values());
        System.out.println("hashMap.keySet() "+linkedHashMap.keySet());

        Map map2 = new HashMap();
        map2 = linkedHashMap;
        System.out.println(map2.equals(linkedHashMap));
        System.out.println(linkedHashMap.getOrDefault("ss", 23));

        linkedHashMap.remove("HP");
        System.out.println(linkedHashMap);
        linkedHashMap.replace("LG", 55);
        System.out.println(linkedHashMap);
        // якщо Value пусте, то воно перезапише значення.
        System.out.println(linkedHashMap.putIfAbsent("HP", 323));
        // стирає всю мапу
        linkedHashMap.clear();
    }
}
