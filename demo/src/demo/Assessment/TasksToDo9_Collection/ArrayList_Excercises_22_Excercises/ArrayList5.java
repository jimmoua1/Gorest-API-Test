package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
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
}
