package ua.lviv.lgs.lesson18.homework;


import java.util.*;

public class Map <K,V>{
    HashMap<K,V> hashMap = new HashMap<>();

    public Map(HashMap<K, V> hashMap) {
        this.hashMap = hashMap;
    }

    public Map(){}

    public void addElement(K key,V value){
        hashMap.put(key, value);
    }
    public void removeWithKey(K key){
        Set<java.util.Map.Entry<K, V>> entries = hashMap.entrySet();
        Iterator<java.util.Map.Entry<K, V>> iterator = entries.iterator();
        while (iterator.hasNext()){
            java.util.Map.Entry<K, V> next = iterator.next();
            if (next.getKey().equals(key)){
                iterator.remove();
            }
        }
    }
    public void removeWithValue(V value){
        Set<java.util.Map.Entry<K, V>> entries = hashMap.entrySet();
        Iterator<java.util.Map.Entry<K, V>> iterator = entries.iterator();
        while (iterator.hasNext()){
            java.util.Map.Entry<K, V> next = iterator.next();
            if(next.getValue().equals(value)){
                iterator.remove();
            }
        }
    }

    public void printKeySet(){
        Set<java.util.Map.Entry<K, V>> entries = hashMap.entrySet();
        Iterator<java.util.Map.Entry<K, V>> iterator = entries.iterator();
        Set<K> set = new HashSet<>();
        while (iterator.hasNext()){
            java.util.Map.Entry<K, V> next = iterator.next();
            set.add(next.getKey());
        }
        System.out.println(set);
    }
    public void printValueList(){
        Set<java.util.Map.Entry<K, V>> entries = hashMap.entrySet();
        Iterator<java.util.Map.Entry<K, V>> iterator = entries.iterator();
        List<V> list = new ArrayList<>();
        while (iterator.hasNext()){
            java.util.Map.Entry<K, V> next = iterator.next();
          list.add(next.getValue());
        }
        System.out.println(list);
    }
    public void printMap(){
        System.out.println(hashMap);
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new Map<>();
        map.addElement(1,"23");
        map.addElement(2,"name");
        map.addElement(3,"LastName");
        map.printKeySet();
        map.printValueList();
        map.printMap();
        map.removeWithKey(2);
        map.printMap();
        map.removeWithValue("23");
        map.printMap();

        Map<String,Boolean> stringBooleanMap = new Map<>();
        stringBooleanMap.addElement("Green",true);
        stringBooleanMap.addElement("Red",true);
        stringBooleanMap.addElement("Yellow",false);
        stringBooleanMap.addElement("Gray",false);
        stringBooleanMap.addElement("Purple",false);
        stringBooleanMap.addElement("Blue",true);
        stringBooleanMap.printMap();
        stringBooleanMap.printKeySet();
        stringBooleanMap.printValueList();
        stringBooleanMap.removeWithKey("Blue");
        stringBooleanMap.removeWithValue(false);
        stringBooleanMap.printMap();

        Map<Integer,MyEntry<String,String>> myEntryMap = new Map<>();
        myEntryMap.addElement(1,new MyEntry<>("ELIJAH", "Smith"));
        myEntryMap.addElement(14,new MyEntry<>("ISABELLA", "Johnson"));
        myEntryMap.addElement(4,new MyEntry<>("MICHAEL", "Williams"));
        myEntryMap.addElement(6,new MyEntry<>("WYATT", "Brown"));
        myEntryMap.addElement(8,new MyEntry<>("GABRIELLA", "Jones"));
        myEntryMap.addElement(2,new MyEntry<>("PIPER", "Garcia"));
        myEntryMap.addElement(7,new MyEntry<>("ADELINE", "Miller"));
        myEntryMap.addElement(33,new MyEntry<>("NATALIA", "Davis"));
        myEntryMap.addElement(3,new MyEntry<>("AUGUST", "Rodriguez"));
        myEntryMap.printMap();
        myEntryMap.removeWithKey(33);
        myEntryMap.removeWithValue(new MyEntry<>("WYATT", "Brown"));
        myEntryMap.printValueList();
        myEntryMap.printKeySet();
        myEntryMap.printMap();



    }
}
