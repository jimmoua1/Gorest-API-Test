package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.ArrayList;

public class ArrayList22 {
    public static void main(String[] args) {
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
}
