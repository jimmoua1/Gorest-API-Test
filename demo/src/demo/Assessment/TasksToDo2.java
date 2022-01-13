package demo.Assessment;

// Primitive Data Types
    // Whole Numbers
        // Int = -2 billion = +2 billion | -2^32 or 2^32
        // Long = 2 trillion = + 2 trillion
    // Decimal Numbers
        // Float = tenth decimal -> 0.1
        // Double = hundredth decimal -> 0.01

    // letters
        // Char = ''

    // boolean
        // True/False
//-------------------------------------------------------------------------
// Q 1 :Write a Java program to get a number from the user and print whether it is positive or negative.
//
// Test Data
// Input number: 35
// Expected Output :
// Number is positive

// Q 2: Take three numbers from the user and print the greatest number.
//
// Test Data
// Input the 1st number: 25
// Input the 2nd number: 78
// Input the 3rd number: 87
// Expected Output :
// The greatest: 87

// Q 3: Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
//      Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
//
// Test Data
// Input a number: 25
// Expected Output :
// Input value: 25
// Positive number

// Q4: Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. [Hint: Switch case]

// Test Data
// Input number: 3
// Expected Output :
// Wednesday

public class TasksToDo2 {
    public static void main(String[] args) {
        Question1(35);
        Question2(25,78,87);

        Question3(0);
        Question3(0.5f);
        Question3(1000001);
        Question3(2);
        Question3(-0.5f);
        Question3(-10000000);
        Question3(-2);

        Question4(3);
    }

    public static void Question1(int a){
        if (a > 0){
            System.out.println("Number is positive");
        } else if ( a == 0){
            System.out.println("Both number is equal");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static void Question2(int a, int b, int c){
        if (a < b){
            if (a < c){
                System.out.println("The greatest: " +c);
            } else {
                System.out.println("The greatest is b: " +b);
            }
        } else if (a > b){
            if(a > c){
             System.out.println("The greatest is a: " +a);
            }
        } else {
            System.out.println("The greatest is not found");
        }
    }

    public static void Question3(float number) {
        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            if (number < 1) {
                System.out.println("small positive");
            } else if (number > 1000000) {
                System.out.println("large positive");
            } else {
                System.out.println("number is positive");
            }
        } else {
            if (number > -1) {
                System.out.println("small negative");
            } else if (number < -1000000) {
                System.out.println("large negative");
            } else {
                System.out.println("number is negative");
            }
        }
    }

    public static void Question4(int number){
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}


