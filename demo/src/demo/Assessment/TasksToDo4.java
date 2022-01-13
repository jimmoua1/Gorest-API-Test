// Q 1: Java Program to Check if two Arrays are Equal or not
//
// Input  : arr1[] = {1, 2, 5, 4, 0};
//          arr2[] = {1, 2, 5, 4, 0};
// Output : Yes

// Q 2: Java Program to find the largest element in an array
// Input : arr[] = {10, 20, 4}
// Output : 20
//
// Input : arr[] = {20, 10, 20, 4, 100}
// Output : 100

// Q 3: Given an array, the task is to write a Java program to check whether a specific element is present in this Array or not.
// Input: arr[] = [5, 1, 1, 9, 7, 2, 6, 10], key = 7
// Output: true
//
// Input: arr[] = [-1, 1, 5, 8], key = -2
// Output: false

// Q 4: Java Program for factorial of a number
// For example factorial of 6 is 65432*1 which is 720.

// Q 5: Java Program to Display All Odd Numbers from 1 to N
// Input: N = 5
// Output: 1,3,5

// Q 6: Write a Java program to copy an array by iterating the array

// Q 7: Write a Java program to find the maximum and minimum value of an array.

// Q 8: Write a Java program to find the common elements between two arrays (string values)
// Array1 : [Python, JAVA, PHP, C#, C++, SQL]
// Array2 : [MySQL, SQL, SQLite, Oracle, PostgreSQL, DB2, JAVA]
// Common element is : [JAVA, SQL]

package demo.Assessment;

import java.util.Arrays;

public class TasksToDo4 {
    public static void main(String[] args) {
        Question1(new int[]{1, 2, 5, 4, 0}, new int[]{1, 2, 5, 4, 0});
        Question2(new int[]{10, 20, 4, 50, 30});

        Question3(new int[]{5, 1, 1, 9, 7, 2, 6, 10}, 7);
        Question3(new int[]{-1, 1, 5, 8}, 2);

        Question4(6);
        Question5(5);
        Question6(new int[]{1, 2, 3, 4});
        Question7(new int[]{5, 6, 7, 8, 10});

        String arr3[] = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String arr4[] = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        Question8(arr3, arr4);
    }

    public static void Question1(int[] arr1, int[] arr2){
        boolean flag = true;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("Yes, equal");
        } else {
            System.out.println("No, not equal");
        }
    }

    public static void Question2(int[] arr){
        Arrays.sort(arr);
        int largest = 0;
        for(int i = 0; i < arr.length ;i++){
            // Compare with the largest variable
            if(arr[arr.length - 1] == arr[i]){
                largest = arr[i];
                    System.out.println("Output: " + largest + " is the largest");
            }
        }
    }

    public static void Question3(int[] arr, int key){
        boolean test = false;

        // For-each loop - loop through one at a time in the array
        for(int element : arr){
            if (element == key){
                test = true;
                System.out.println(test);
            }
        }
    }

    public static void Question4(int number){
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    public static void Question5(int N){
        System.out.println("Output: ");
        for(int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
        }
    }

    public static void Question6(int[] arr1){
        int[] arr2 = {};
        arr2 = arr1.clone();
        System.out.println("Copied Array is " + Arrays.toString(arr2));
    }

    public static void Question7(int[] arr){
        Arrays.sort(arr);
        System.out.println("The Minimum is " + arr[0]);
        System.out.println("The Maximum is " + arr[arr.length - 1]);

// Another Solution with no sorting
//
//        int Maximum = arr[0];
//        int Minimum = arr[0];
//
//        for(int i = 1; i < arr.length ; i++){
//            if(arr[i] > Maximum){
//                Maximum = arr[i];
//                System.out.println("Maximum value is: " +Maximum);
//            }
//        }
//
//        for(int i = 1; i < arr.length ; i++){
//            if(arr[i] < Minimum){
//                Minimum = arr[i];
//                System.out.println("Minimum value is: " +Minimum);
//            }
//        }
    }

    public static void Question8(String[] arr1, String[] arr2){
        String copy[] = new String[arr2.length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if (arr2[j].equalsIgnoreCase(arr1[i])){
                    copy[i] = arr2[j];
                }
            }
        }

        copy = Arrays.stream(copy)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(copy));
    }
}
