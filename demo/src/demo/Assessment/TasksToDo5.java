// Q 1: Write a Java program to get the index of all the characters of the alphabet.
//
//  Sample Output:
//      a  b c  d e  f  g h i  j
//      =========================
//      36 10 7 40 2 16 42 1 6 20
//
//      k  l  m  n  o  p q  r  s  t
//      ===========================
//      8 35 22 14 12 23 4 11 24 31
//
//      u  v  w  x  y  z
//      ================
//      5 27 13 18 38 37
//
//    Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

// Q 2: Write a Java program to replace a specified character with another character.
//
//  Sample Output:
//
//  Original string: The quick brown fox jumps over the lazy dog.
//      ---Replace all the 'd' characters with 'f' characters.---
//    New String: The quick brown fox jumps over the lazy fog.

// Q 3:  Write a Java program to get a substring of a given string between two specified positions.
//
//  Sample Output:
//
//        old = The quick brown fox jumps over the lazy dog.
// ---Get a substring of the above string starting from index 10 and ending at index 26.---
//        new = brown fox jumps

// Q 4 : Write a Java program to trim any leading or trailing whitespace from a given string.
//
//  Sample Output:
//
//  Original String:  Java Exercises
//  New String: Java Exercises

// Q 5 : Write a Java program to divide a string in n equal parts.
//
//  Sample Output:
//
//  The given string is: abcdefghijklmnopqrstuvwxy
//  The string divided into 5 parts and they are:
//
//  abcde
//  fghij
//  klmno
//  pqrst
//  uvwxy

// Q 6: Write a Java program to reverse words in a given string.
//
//  Sample Output:
//
//  The given string is: Reverse words in a given string
//  The new string after reversed the words: string given an in words Reverse

// Q 7 : Write a Java program to read a given string and if the first or last characters are same return the string without those characters otherwise return the string unchanged.
//
//  Sample Output:
//
//  The given strings is: testcricket
//  The new string is: estcricke

// Q 8 : Write a Java program to compare two strings . [Two strings are  equal if they are the same length and contain the same characters in the same positions. ]
//
//  Sample Output:
//
//  String 1: This is Exercise 1
//  String 2: This is Exercise 2
//  "This is Exercise 1" is less than "This is Exercise 2"

package demo.Assessment;

public class TasksToDo5 {
    public static void main(String[] args) {
        Question1("The quick brown fox jumps over the lazy dog.");
        Question2("The quick brown fox jumps over the lazy dog.");
        Question3("The quick brown fox jumps over the lazy dog.");
        Question4("  Java Exercises");
        Question5("abcdefghijklmnopqrstuvwxy");
        Question6("Reverse words in a given string");
        Question7("testcricket");
        Question8("This is Exercise 1","This is Exercise 2");
    }

    public static void Question1(String word){
        int a = word.indexOf("a");
        int b = word.indexOf("b");
        int c = word.indexOf("c");
        int d = word.indexOf("d");
        int e = word.indexOf("e");
        int f = word.indexOf("f");
        int g = word.indexOf("g");
        int h = word.indexOf("h");
        int i = word.indexOf("i");
        int j = word.indexOf("j");
        int k = word.indexOf("k");
        int l = word.indexOf("l");
        int m = word.indexOf("m");
        int n = word.indexOf("n");
        int o = word.indexOf("o");
        int p = word.indexOf("p");
        int q = word.indexOf("q");
        int r = word.indexOf("r");
        int s = word.indexOf("s");
        int t = word.indexOf("t");
        int u = word.indexOf("u");
        int v = word.indexOf("v");
        int w = word.indexOf("w");
        int x = word.indexOf("x");
        int y = word.indexOf("y");
        int z = word.indexOf("z");

        System.out.println("a  b c  d e  f  g h i  j");
        System.out.println("=========================");
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " " + j);
        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("=========================");
        System.out.println(k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q + " " + r + " " + s + " " + t);
        System.out.println("u  v  w  x  y  z");
        System.out.println("=========================");
        System.out.println(u + " " + v + " " + w + " " + x + " " + y + " " + z);
    }

    public static void Question2(String word){
        String replace = word.replace('d', 'f');
        System.out.println(replace);
    }

    public static void Question3(String word){
        String sub = word.substring(10, 26);
        System.out.println(sub);
    }

    public static void Question4(String word){
        String trimmed = word.trim();
        System.out.println(trimmed);
    }

    public static void Question5(String word){
        String firstSet = word.substring(0, 5);
        String secondSet = word.substring(5, 10);
        String thirdSet = word.substring(10, 15);
        String fourthSet = word.substring(15, 20);
        String fifthSet = word.substring(20, 25);
        System.out.println(firstSet.toString());
        System.out.println(secondSet.toString());
        System.out.println(thirdSet.toString());
        System.out.println(fourthSet.toString());
        System.out.println(fifthSet.toString());
    }

    public static void Question6(String word){
        String[] letter = word.split(" ");
        String reverse = "";

        // Array
        for(int i = 0; i < letter.length; i++){
            reverse = reverse + letter[letter.length - (i + 1)] + " ";
        }
        System.out.println("Reversed word: " + reverse);

//        // Array in reverse
//        for(int i = letter.length - 1; i >= 0; i--){
//            reverse = reverse + letter[i] + " ";
//        }
//        System.out.println("Reversed word: " + reverse);
    }

    public static void Question7(String word){
       int amount = word.length();

       if(amount < 2){
           System.out.println("The given string is: " +word + "\nThe new string is: " +word);
       } else if (word.charAt(0) == word.charAt(amount - 1)){
           System.out.println("The given string is: " +word + "\nThe new string is: "  +word.substring(1, amount - 1));
       } else {
           System.out.println("The given string is: " +word + "\nThe new string is: " +word);
       }
    }

    public static void Question8(String word1, String word2){
        int total = word1.compareTo(word2);
        System.out.println("String 1: " +word1 + "\nString 2: " +word2);

        if(total == 0){
            System.out.println("String 1 and 2 is the same");
        } else if (total < 0){
            System.out.println(word1 + " is less than " +word2);
        } else if (total > 0){
            System.out.println(word2 + " is greater than " +word1);
        }
    }

}

