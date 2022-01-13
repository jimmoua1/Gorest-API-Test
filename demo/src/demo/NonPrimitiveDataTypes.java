package demo;

import java.util.Arrays;
import java.util.Locale;

public class NonPrimitiveDataTypes {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);

//        String[] s = {"Genspark", "JAVA"};
    // String[] s = new String[] {"Genspark", "JAVA"};
//        System.out.println(s[0] + s[1]);

    // int, float, char
//        Integer i = new Integer(1);
    // Integer i = 0;

        // immutable and mutable
        String r = "JaVA";
        String r1 = new String("JaVA");

        String s = " JAVA ";
        char c = 'J';
        System.out.println(s.charAt(0));
        System.out.println(s.length());

        // Remove Spaces in variable s
        s = s.trim();
        System.out.println(s);

        // Lower case in variable s
        s = s.toLowerCase();
        System.out.println(s);

        // Upper case in variable s
        s = s.toUpperCase();
        System.out.println(s);

        // Find a letter/character in variable s
        int positionOfJ = s.indexOf('J');
        System.out.println(positionOfJ);

        // combine two words from "variable b" to "b.concat()"
        String b = " JaVA ";
        b.concat("Script");
        System.out.println(b);

        // if|else statement
        int w = 1;
        int x = 1;
        int y = 2;
        int z = x + y;

        // z greater than 0 output z
        if (z > 0){
            System.out.println(z);
        }

        // x equal to w, if so, output text
        if(x == w){
            System.out.println("Both are same");
        }

        // x equal to w, if so, output text
        if(b.equals(b)){
            System.out.println("Both are same");
        }

    }
}
