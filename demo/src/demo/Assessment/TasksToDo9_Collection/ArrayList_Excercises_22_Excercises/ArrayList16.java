package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.ArrayList;

public class ArrayList16 {
    public static void main(String[] args) {
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
}
