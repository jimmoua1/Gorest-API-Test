package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets.KarasTasksToDo10_ProblemSolving.Problem_3;

import com.sun.source.tree.Tree;

import java.util.*;

public class largeAndSmallTreeSet {

    public static void makeSet(Integer[] numbers, TreeSet<Integer> set) {
        set.addAll(Arrays.asList(numbers));
    }

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        Integer[] values = {55,33,99,11,66,22};

        makeSet(values, treeSet);

        //Because TreeSet is In Ascending Order the Smallest will be at treeSet.first() and the Largest will be at treeSet.last()
        System.out.println("This is the tree set: " + treeSet);
        System.out.println("This is the smallest: " + treeSet.first() + "\nThis is the Largest: " + treeSet.last());
    }



}
