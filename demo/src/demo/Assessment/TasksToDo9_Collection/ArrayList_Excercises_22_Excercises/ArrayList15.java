package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.ArrayList;

public class ArrayList15 {
    public static void main(String[] args) {
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
}
