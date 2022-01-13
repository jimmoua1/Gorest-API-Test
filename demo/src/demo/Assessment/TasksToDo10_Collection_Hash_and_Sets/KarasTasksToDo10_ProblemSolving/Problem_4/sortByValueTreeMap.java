package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets.KarasTasksToDo10_ProblemSolving.Problem_4;

import java.util.*;


public class sortByValueTreeMap {
    public static void makeMap(Map<Integer,Integer> map, Integer[] keys, Integer[] values){
        if(values.length == keys.length) {
            for (int i = 0; i < keys.length; i++) {
                map.put(i, values[i]);
            }
        } else{
            System.out.println("The arrays are not equal so this cannot be done!");
        }
    }

    public static <Key, Value extends Comparable<Value>> Map<Key, Value>
     sortByValue(final Map<Key,Value> map){
        Comparator<Key> valueCompare = new Comparator<Key>() {
            public int compare(Key key1, Key key2) {
                int compare = map.get(key1).compareTo(map.get(key2));
                if(compare == 0){
                    return 1;
                } else{
                    return compare;
                }
            }
        };

        Map<Key, Value> sortedByValues = new TreeMap<Key, Value>(valueCompare);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        Integer[] keys = {0, 1, 2, 3, 4, 5};
        Integer[] values = {55,33,99,11,66,22};

        makeMap(treeMap, keys, values);
        sortByValue(treeMap);

        //To Use a For Each Loop instead of an iterator on Maps you still need a set

        Set<Integer> setCodes = treeMap.keySet();

        for (Integer code : setCodes) {
            Integer value = treeMap.get(code);
            System.out.println("The value at this key: " + code + " is: " + value);
        }
    }
}
