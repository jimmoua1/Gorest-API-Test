package demo.Assessment.TasksToDo9_Collection.ArrayList_Excercises_22_Excercises;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
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
}
