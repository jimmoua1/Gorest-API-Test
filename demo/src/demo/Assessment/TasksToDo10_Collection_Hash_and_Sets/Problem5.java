// Problem 5: Print characters and their frequencies in order of occurrence
//        Input : str = "geeksforgeeks"
//        Output : g2 e4 k2 s2 f1 o1 r1
//
//        Input : str = "elephant"
//        Output : e2 l1 p1 h1 a1 n1 t1

package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets;

import java.util.*;

class Problem5 {
    public static void sameCharacter(String s) {
        Map<Character, Integer> d = new HashMap<>();

        // print if it has the character
        for (int i = 0; i < s.length(); i++) {
            if (d.containsKey(s.charAt(i))) {
                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
            } else {
                d.put(s.charAt(i), 1);
            }
        }

        // print if character not printed before
        for (int i = 0; i < s.length(); i++) {
            if (d.get(s.charAt(i)) != 0) {
                System.out.print(s.charAt(i));
                System.out.print(d.get(s.charAt(i)) + " ");
                d.put(s.charAt(i), 0);
            }
        }
    }

    public static void main(String[] args) {
        String S = "geeksforgeeks";
        sameCharacter(S);
    }
}
