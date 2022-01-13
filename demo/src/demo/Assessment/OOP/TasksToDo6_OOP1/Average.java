package demo.Assessment.OOP.TasksToDo6_OOP1;

// 8. Print the average of three numbers entered by user by creating a class named 'Average'
//         having a method to calculate and print the average.


import java.util.Scanner;

public class Average {
    float first;
    float second;
    float third;

    public Average(float a, float b, float c){
        first = a;
        second = b;
        third = c;
    }

    public double getAverage(){
        double result = (first + second + third) / 3;
        return result;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int first;
        int second;
        int third;

        System.out.println("Finding the Average number of three. \nEnter the first Number: ");
        first = Input.nextInt();
        System.out.println("Enter the second Number: ");
        second = Input.nextInt();
        System.out.println("Enter the third Number: ");
        third = Input.nextInt();

        Average total = new Average(first, second, third);
        System.out.println("The Average is: " +total.getAverage());
    }

}
