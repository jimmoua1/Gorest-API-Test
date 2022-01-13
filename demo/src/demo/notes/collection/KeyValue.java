package demo.notes.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValue {
    public static void main(String[] args) {
        // [0, java] [1, java script] --> Map
        HashMap<String, Integer> map = new HashMap<>();
        map.put("oops", 1);
        map.put("js", 2);
        map.put("js", 4);
        Set<String> keys = map.keySet();
        map.values();
        System.out.println(map);

        boolean flag = map.containsKey("js");
        map.remove("js");

        Set<Map.Entry<String,Integer>> entries = map.entrySet();

        for (Map.Entry entry: entries){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
