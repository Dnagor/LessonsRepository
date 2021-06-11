package ua.lviv.lgs.lesson15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp {

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("HP",1102);
        hashMap.put("LG",709);
        hashMap.put("Medion",15);
        hashMap.put("Philips",40);
        hashMap.put("Iphone",3);

        System.out.println(hashMap);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> set : entries){
            System.out.println(set);
        }

        System.out.println("hashMap.get(\"HP\") "+ hashMap.get("HP"));
        System.out.println("hashMap.containsKey(\"LG\") "+hashMap.containsKey("LG"));
        System.out.println(hashMap.containsValue(1102));
        System.out.println(hashMap.values());
        System.out.println("hashMap.keySet() "+hashMap.keySet());

        Map map2 = new HashMap();
        map2 = hashMap;
        System.out.println(map2.equals(hashMap));
        System.out.println(hashMap.getOrDefault("ss", 23));

        hashMap.remove("HP");
        System.out.println(hashMap);
        hashMap.replace("LG", 55);
        System.out.println(hashMap);
        // якщо Value пусте, то воно перезапише значення.
        System.out.println(hashMap.putIfAbsent("HP", 323));
        // стирає всю мапу
        hashMap.clear();
    }
}
