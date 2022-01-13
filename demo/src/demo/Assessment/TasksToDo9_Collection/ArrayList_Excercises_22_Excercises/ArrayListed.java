package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.*;

public class ArrayListed {
    // 1. Write a Java program to associate the specified value with
    //    the specified key in a HashMap.
    public void ArrayListed1(){
        // Make ArrayList and print out
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Orange");
        color.add("Pink");
        System.out.println(color);
    }

    public void ArrayListed2(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Brown");
        colors.add("Pink");

        // iterate through arrayList
        for(int i = 0; i < colors.size(); i++){
            String total = colors.get(i);
            System.out.println(total);
        }

        System.out.println("");

        // forEach method -> works same
        for(String iterating : colors){
            System.out.println(iterating);
        }
    }

    public void ArrayListed3(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // insert
        colors.add(0, "Cyan");
        System.out.println(colors);
    }

    public void ArrayListed4(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Retrieve an element (at a specified index) from a given array list
        colors.get(0);
        System.out.println(colors.get(0));
    }

    public void ArrayListed5(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Update specific array element by given element
        colors.set(0, "Orange");
        System.out.println(colors);
    }

    public void ArrayListed6(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        //
        colors.remove(0);
        System.out.println(colors);
    }

    public void ArrayListed7(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // test if the ArrayList has "Cyan"
        System.out.println(colors.contains("Cyan"));
    }

    public void ArrayListed8(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        //  sort the colors alphabetical
        Collections.sort(colors);
        System.out.println(colors);
    }

    public void ArrayListed9(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Combine array "colorsTwo" to "colors"
        ArrayList<String> colorsTwo = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        Collections.copy(colors, colorsTwo);
        System.out.println(colors);
    }

    public void ArrayListed10(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // shuffle the ArrayList
        Collections.shuffle(colors);
        System.out.println(colors);
    }

    public void ArrayListed11(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // reverse ArrayList
        Collections.reverse(colors);
        System.out.println(colors);
    }

    public void ArrayListed12(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Half the colors ArrayList from element 0 - 2
        colors.subList(0, 2);
        System.out.println(colors.subList(0, 2));
    }

    public void ArrayListed13(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        ArrayList<String> colorsTwo = new ArrayList<>();
        colorsTwo.add("Cyan");
        colorsTwo.add("Blue");
        colorsTwo.add("Green");
        colorsTwo.add("Brown");
        colorsTwo.add("Pink");

        // Compare two ArrayList
        boolean compared = colors.equals(colorsTwo);
        System.out.println(compared);  // false because not same
    }

    public void ArrayListed14(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Swap element 0 -> 1
        Collections.swap(colors, 0, 1);
        System.out.println(colors);
    }

    public void ArrayListed15(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Combine two ArrayList (Similar to .copy at ArrayList9)
        ArrayList<String> colorsTwo = new ArrayList<>();
        colorsTwo.add("Cyan");
        colorsTwo.add("Orange");
        colorsTwo.add("Pink");
        colorsTwo.add("Blue");

        colors.addAll(colorsTwo);
        System.out.println(colors);
    }

    public void ArrayListed16(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Clone an array list to another array list
        ArrayList colorsTwo;
        colorsTwo = (ArrayList)colors.clone();
        System.out.println(colorsTwo);
    }

    public void ArrayListed17(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Empty an array list
        colors.clear();
        System.out.println(colors);
    }

    public void ArrayListed18(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Test an array list is empty or not
        colors.isEmpty();
        System.out.println(colors.isEmpty()); // always false because "isSize()" is not empty
    }

    public void ArrayListed19(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Trimming inside ArrayList
        colors.trimToSize();
        System.out.println(colors);
    }

    public void ArrayListed20(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Increase size of array list
        System.out.println("Original Array: " + colors);
        colors.ensureCapacity(8);
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Red");
        System.out.println("New Array: " +colors);
    }

    public void ArrayListed21(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Replace second element with specified element
        System.out.println("Original: " +colors);
        colors.set(1, "Black");
        System.out.println("New: " +colors);
    }

    public void ArrayListed22(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Pink");

        // Print all the elements of a ArrayList using the position of the elements
        for(int i = 0; i < colors.size() ; i++){
            String results = colors.get(i);
            System.out.println(results);
        }
    }

    public static void main(String[] args) {
        ArrayListed test = new ArrayListed();
        System.out.println("Question 1");
        System.out.println("-------------------------");
        test.ArrayListed1();
        System.out.println("-------------------------");
        System.out.println("Question 2");
        test.ArrayListed2();
        System.out.println("-------------------------");
        System.out.println("Question 3");
        test.ArrayListed3();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 4");
        test.ArrayListed4();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 5");
        test.ArrayListed5();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 6");
        test.ArrayListed6();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 7");
        test.ArrayListed7();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 8");
        test.ArrayListed8();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 9");
        test.ArrayListed9();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 10");
        test.ArrayListed10();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 11");
        test.ArrayListed11();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 12");
        test.ArrayListed12();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 13");
        test.ArrayListed13();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 14");
        test.ArrayListed14();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 15");
        test.ArrayListed15();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 16");
        test.ArrayListed16();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 17");
        test.ArrayListed17();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 18");
        test.ArrayListed18();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 19");
        test.ArrayListed19();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 20");
        test.ArrayListed20();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 21");
        test.ArrayListed21();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 22");
        test.ArrayListed22();
        System.out.println("-------------------------");
    }
}
