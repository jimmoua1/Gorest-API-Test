// Problem 4: Sort a TreeMap<Integer,Integer> based on values.

package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class ValueComparator implements Comparator {
    Map<Integer, Integer> map;

    public ValueComparator(Map<Integer, Integer> map) {
        this.map = map;
    }

    public int compare(Object keyA, Object keyB) {
        Comparable valueA = map.get(keyA);
        Comparable valueB = map.get(keyB);
        return valueB.compareTo(valueA);
    }
}

public class Problem4 {
    public static TreeMap<Integer, Integer> sortMapByValue(HashMap<Integer, Integer> map){
        Comparator<Integer> comparator = new ValueComparator(map);
        //TreeMap is a map sorted by its keys.
        //The comparator is used to sort the TreeMap by keys.
        TreeMap<Integer, Integer> result = new TreeMap<>(comparator);
        result.putAll(map);
        return result;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 30);
        map.put(3, 50);
        map.put(4, 40);
        map.put(5, 20);
        System.out.println("Before Sorted By Value: " +map);

        TreeMap<Integer, Integer> sortedMap = sortMapByValue(map);
        System.out.println("Sorted By Value: " +sortedMap);
    }
}

