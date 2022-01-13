package demo.notes.collection;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        // Convert from this wanting 10 to 20 array list to below ArrayList
//        int[] array = new int[10];
//            for (int i = 0; i < array.length; i++){
//                array[i] = i;
//            }
//
//            int[] biggerArray = new int[20];
//        for(int i = 0; i < array.array.length; i++){
//
//        }

                                                        // initialCapacity = the ma arrays
        ArrayList<String> arrayList = new ArrayList<>(200);  // load factor = 0.75
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("22");

                    // remove "22" value from array
        arrayList.remove("22");

                    // check if array have "22" if not return 'false'
        boolean flag = arrayList.contains("22");

                    // set first element to 33
        arrayList.set(1, "33");

                    // clear the array elements all
        arrayList.clear();

        // iterate through all elements in array, output the elements
        int size = arrayList.size();
        for (int i = 0; i < size; i++){
            System.out.println(i);
        }
        arrayList.clear();
    }
}
