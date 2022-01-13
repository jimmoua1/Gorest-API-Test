package demo.Assessment.TasksToDo9_Collection.HashSet_Excercises_12_Excercises;

import java.util.*;

public class HashSetting {
    // 1. Write a Java program to associate the specified value with
    //    the specified key in a HashMap.
    public void HashSetting1(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // Make a HashSet and print it out
        System.out.println(setting);
    }

    public void HashSetting2(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // Iterate through all elements in Hash list | forEach loop
        for(Integer integer: setting){
            System.out.println(integer);
        }
    }

    public void HashSetting3(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // Get the number of elements in a hash set
        System.out.println("total number of elements: " +setting.size());
    }

    public void HashSetting4(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // Empty hash set
        setting.clear();
        System.out.println(setting);
    }

    public void HashSetting5(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // Test hash set is empty
        setting.isEmpty();
        System.out.println(setting.isEmpty());  // false
    }

    public void HashSetting6(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // Clone hash set
        System.out.println("Original: " +setting);
        HashSet setting2;
        setting2 = (HashSet) setting.clone();
        System.out.println("Clone: " +setting2);
    }

    public void HashSetting7(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // HashSet to Array
        setting.toArray();
        System.out.println(setting);
    }

    public void HashSetting8(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(3);
        setting.add(2);
        setting.add(1);
        setting.add(4);
        System.out.println("Before Tree: " +setting);

        // Convert HashSet to TreeSet
        Set<Integer> ChangeTree = new TreeSet<>(setting);
        for(Integer total : ChangeTree){
            System.out.println("As a Tree: " +total);
        }
    }

    public void HashSetting9(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // Convert HashSet to List/ArrayList (toString to output array to console)
        setting.toArray();
        System.out.println(Arrays.toString(setting.toArray()));
    }

    public void HashSetting10(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);


        HashSet<Integer> setting2 = new HashSet<>();
        setting2.add(5);
        setting2.add(6);
        setting2.add(7);
        setting2.add(8);

        // Compare two hash set
        setting.equals(setting2);
        System.out.println(setting.equals(setting2));
    }

    public void HashSetting11(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        HashSet<Integer> setting2 = new HashSet<>();
        setting.add(5);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        // 11 - compare two sets and retain elements which are same on both sets
        setting.retainAll(setting2);
        System.out.println(setting.retainAll(setting2)); // true because both set are same elements
    }

    public void HashSetting12(){
        HashSet<Integer> setting = new HashSet<>();
        setting.add(1);
        setting.add(2);
        setting.add(3);
        setting.add(4);

        //  Remove all Hash Set
        setting.clear();
        System.out.println(setting);
    }

    public static void main(String[] args) {
        HashSetting test = new HashSetting();
        System.out.println("Question 1");
        System.out.println("-------------------------");
        test.HashSetting1();
        System.out.println("-------------------------");
        System.out.println("Question 2");
        test.HashSetting2();
        System.out.println("-------------------------");
        System.out.println("Question 3");
        test.HashSetting3();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 4");
        test.HashSetting4();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 5");
        test.HashSetting5();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 6");
        test.HashSetting6();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 7");
        test.HashSetting7();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 8");
        test.HashSetting8();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 9");
        test.HashSetting9();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 10");
        test.HashSetting10();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 11");
        test.HashSetting11();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 12");
        test.HashSetting12();
        System.out.println("-------------------------");
    }
}
