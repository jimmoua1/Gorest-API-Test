package demo.Assessment;
import java.util.Arrays;

//Task 1 : Write a function to perform the operation a+b-c
//Task 2 : Write a function to perform the operation a+b/d
//Task 3 : Write a function to perform the operation a+b/c*d
//Task 4 : Create a String array and store all the participants name in it

public class TasksToDo1 {

    public static void main(String[] args) {
        AddSubtract(4, 3, 4);
        AddDivide(4, 3, 2);
        AddDivideMultiply(4, 3, 4, 2);
        StringArray();

        Object Array[] = {"Student", 1, "Teacher", 2.132,};
    }

    public static void AddSubtract(int a, int b, int c) {
        long total = a + b - c;
        System.out.println("a + b - c = " + total);
    }

    public static void AddDivide(int a, int b, int d) {
        long total = a + b / d;
        System.out.println("a + b / d = " + total);
    }

    public static void AddDivideMultiply(int a, int b, int c, int d) {
        long total = a + ((b / c) * d);
        System.out.println("a + b / c * d = " + total);
    }

    public static void StringArray() {
        String occupation[] = {"Student", "Teacher", "Teacher Assistant", "Principle"};
        System.out.println(Arrays.toString(occupation));
    }
}





