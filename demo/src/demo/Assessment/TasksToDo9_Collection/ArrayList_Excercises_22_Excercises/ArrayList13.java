package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList13 {
    public static void main(String[] args) {
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
}
