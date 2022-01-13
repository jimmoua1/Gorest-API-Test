// Problem 2: How to create a TreeMap<Integer,Integer> in reverse order in Java

package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Map<Integer, Integer> reverse = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        reverse.put(1, 21);
        reverse.put(2, 22);
        reverse.put(3, 27);
        reverse.put(4, 32);

        Set set = reverse.entrySet();
        Iterator total = set.iterator();

        while (total.hasNext()) {
            Map.Entry me = (Map.Entry)total.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
