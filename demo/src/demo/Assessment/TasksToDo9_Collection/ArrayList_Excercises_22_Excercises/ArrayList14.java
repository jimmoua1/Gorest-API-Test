package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList14 {
    public static void main(String[] args) {
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
}
