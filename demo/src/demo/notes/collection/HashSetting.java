package demo.notes.collection;

import java.util.HashSet;

public class HashSetting {
    public static void main(String[] args) {
        // unique

                    // convert from this to HashSet
//    int[] a = new int[10];
//
//    a[0] = 10;
//    a[1] = 20;
//    int x = 10;
//    for(int i = 0; i < a.length; i++){
//        for (a[i] == x){
//            continue;
//        } else
//            a[i] == x
//    }

        HashSet<Float> set = new HashSet<>();
        set.add(1.11f);
        set.add(1.11f);
        set.add(1.11f);
        set.add(2.11f);
        set.remove(1.11f);
        boolean flag = set.contains(1.11f);
        int size = set.size();
    }
}
