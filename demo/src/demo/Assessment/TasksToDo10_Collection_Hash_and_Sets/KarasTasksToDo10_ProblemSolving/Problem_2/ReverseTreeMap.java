package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets.KarasTasksToDo10_ProblemSolving.Problem_2;

import java.util.*;

public class ReverseTreeMap {

    public static void makeMap(Map<Integer,Integer> map, Integer[] keys,  Integer[] values){
        if(values.length == keys.length) {
            for (int i = 0; i < keys.length; i++) {
                map.put(i, values[i]);
            }
        } else{
            System.out.println("The arrays are not equal so this cannot be done!");
        }
    }


    public static void main(String[] args) {
        Map<Integer, Integer> reverseTreeMap = new TreeMap<>(Collections.reverseOrder());

        Integer[] keys = {0, 1, 2, 3, 4, 5};
        Integer[] values = {55,33,99,11,66,22};

        makeMap(reverseTreeMap, keys, values);

        //To Use a For Each Loop instead of an iterator on Maps you still need a set

        Set<Integer> setCodes = reverseTreeMap.keySet();

        for (Integer code : setCodes) {
            Integer value = reverseTreeMap.get(code);
            System.out.println("The value at this key: " + code + " is: " + value);
        }
    }
}
