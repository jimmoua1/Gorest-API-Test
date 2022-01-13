// Problem 6: Remove duplicate characters from a given String.
//        Input : str = "elephant"
//        Output : elphant

package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets;

import java.util.*;

class Problem6 {

    // method remove duplicate
    public void removeDuplicates(String str) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++)
            lhs.add(str.charAt(i));

        // only print if string not same
        for (Character ch : lhs)
            System.out.print(ch);
    }

    public static void main(String args[]) {
        String str = "elephant";
        Problem6 r = new Problem6();
        r.removeDuplicates(str);
    }
}
