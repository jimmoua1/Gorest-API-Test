package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.ArrayList;

public class ArrayList20 {
    public static void main(String[] args) {
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
}
