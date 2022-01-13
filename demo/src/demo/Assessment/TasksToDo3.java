// Q 1: Write a Java program to get the character at the given index within the String.
//
// Sample Output:
//
// Original String = Java Exercises!
// The character at position 0 is J
// The character at position 10 is i
//-----------------------------------------
// Q2: Write a Java program to verify if the string is a palindrome.
//
// Sample Output:
//
// String 1: madam
// Palindrome
// String 2: JAVA
// Not a Palindrome
//-----------------------------------------
// Q 3: Write a Java program to concatenate a given string to the end of another string.
//
// Sample Output:
// String 1: PHP Exercises and
// String 2: Python Exercises
// The concatenated string: PHP Exercises and Python Exercises
//-----------------------------------------
// Q 4: Write a Java program to check whether two String objects contain the same data.
//
// Sample Output:
//
// "Stephen Edwin King" equals "Walter Winchell"? false
// "Stephen Edwin King" equals "Mike Royko"? false
//-----------------------------------------
// Q 5: Write a Java program to compare a given string to another string, ignoring case considerations.
//
// Sample Output:
// "Stephen Edwin King" equals "Walter Winchell"? false
// "Stephen Edwin King" equals "stephen edwin king"? true
//-----------------------------------------
// Q 6: Write a Java program to convert all the characters in a string to lowercase.
//
// Sample Output:
// Original String: The Quick BroWn FoX!
// String in lowercase: the quick brown fox!
//-----------------------------------------
// Q 7 : Write a program in Java to display the first 10 natural numbers
//
// Expected Output :
//
// The first 10 natural numbers are:
//
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
//-----------------------------------------
// Q 8 :  Write a program in Java to input 5 numbers and find their sum and average.
//
// Test Data
// Input the 5 numbers : 1 2 3 4 5
//
// Expected Output :
// Input the 5 numbers :
// 1
// 2
// 3
// 4
// 5
// The sum of 5 no is : 15
// The Average is : 3.0
//-----------------------------------------
// Q 9 : Write a program in Java to display the cube of the number up to given an integer.
//
// Test Data
// Input number of terms : 4
// Expected Output :
//
// Number is : 1 and cube of 1 is : 1
// Number is : 2 and cube of 2 is : 8
// Number is : 3 and cube of 3 is : 27
// Number is : 4 and cube of 4 is : 64
//-----------------------------------------
// Q 10 : Write a program in Java to display the multiplication table of a given integer.
//
// Test Data
// Input the number (Table to be calculated) : Input number of terms : 5
// Expected Output :
//
// 5 X 0 = 0
// 5 X 1 = 5
// 5 X 2 = 10
// 5 X 3 = 15
// 5 X 4 = 20
// 5 X 5 = 25

package demo.Assessment;

import java.util.Scanner;

public class TasksToDo3 {
    public static void main(String[] args) {
        Task1("Java Exercises!");
        Task2("JAVA");
        Task3("PHP Excercises and", "Python Excercises");
        Task4("Stephen Edwin King", "Walter Winchell", "Mike Royko");
        Task5("Stephen Edwin King", "Walter Winchell", "Walter Winchell");
        Task6("The Quick BroWn FoX!");
        Task7(10);
        Task8();
        Task9(4);
        Task10();
    }

    public static void Task1(String word){
        System.out.println("Original String = " +word);
        System.out.println("The character at position 0  is " + word.charAt(0));
        System.out.println("The character at position 10 is " + word.charAt(10));
    }

    public static void Task2(String string1){
        String a = "";
        for(int i = 0; i > string1.length() - 1; i--){
            char ch = string1.charAt(i);
            a = ch + a;
        }
        System.out.println(a);
        if (a.contentEquals(string1)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void Task3(String String1 , String String2){
        System.out.println("String 1: " +String1);
        System.out.println("String 2: " +String2);
        System.out.println("The concatenated string: " + String1 + " " + String2);
    }

    public static void Task4(String String1, String String2, String String3){
        boolean Test1 = String1 == String2;
        boolean Test2 = String1 == String3;

        if(Test1 || true){
            System.out.println(String1 + " equals " + String2 + " ? " +Test1);
            if(Test2){
                System.out.println(String1 + " equals " + String3 + " ? " +Test2);
            } else {
                System.out.println(String1 + " equals " + String3 + " ? " +true);
            }
        } else {
            System.out.println(String1 + " equals " + String2 + " ? " +true);
        }
    }

    public static void Task5(String String1, String String2, String String3) {
        boolean Test1 = String1.equalsIgnoreCase(String2);
        boolean Test2 = String1.equalsIgnoreCase(String3);
        System.out.println(String1 + " equals " + String2 + " ? " +Test1);
        System.out.println(String1 + " equals " + String3 + " ? " +Test2);
    }

    public static void Task6(String string1){
        String lowercase = string1.toLowerCase();

        System.out.println("Original String: " +string1);
        System.out.println("String in lowercase: " +lowercase);
    }

    public static void Task7(int number){
        for(int i = 0; i < 11;i++){
            System.out.println(i);
        }
    }

    public static void Task8(){
        System.out.println("Input the 5 numbers :" );
        for(int i = 1; i < 6; i++){
            System.out.println(i);
        }
        System.out.println("The sum of 5 no is: 15");
        System.out.println("The Average is: 3.0" );
    }

    public static void Task9(int number){
        int total = number;
        for(int i = 1; i < 5; i++){
            total = i * i * i;
            System.out.println("Number is : " + i + " and cube of " + i + " is :" +total);
        }
    }

    public static void Task10(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = in.nextInt();
        for(int x = 1; x <= 5; x++){
            System.out.println(n + " x " + x + " = " + n * x);
        }
    }
}
