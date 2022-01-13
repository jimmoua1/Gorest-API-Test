// Problem 3: Find the smallest and largest number in a TreeSet<Integer>

package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets;

import java.util.TreeSet;

public class Problem3 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet();
        tree.add(6);
        tree.add(4);
        tree.add(3);
        tree.add(2);

        System.out.println("The smallest: " +tree.first());
        System.out.println("The largest: " +tree.last());
    }
}

