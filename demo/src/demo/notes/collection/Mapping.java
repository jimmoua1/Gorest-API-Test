package demo.notes.collection;

// all three required
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapping {
    public static void main(String[] args) {
        //[ 1, jim ] [ 2, sarat]
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "jim");
        map.put(1, "jim"); // this unique is overwritten to the recent one
        map.put(2, "sarat");

        int size = map.size();
        map.remove("sarat");
        boolean flag = map.containsKey(1);
        Set<Integer> keys = map.keySet();         // get all keys
        map.values(); // get all values
        map.get(1);  // get value
        System.out.println(map);   // print map size to JSON format
        for(Integer i: keys){  // foreach loop to get
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
            for(Map.Entry entry:entries){
                System.out.println(entry.getKey() + "  " + entry);
            }
    }
}
