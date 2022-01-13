package demo.Assessment.OOP.TasksToDo6_OOP1;

// 7. Write a program to print the area of a rectangle by creating a class named 'Area'
//      taking the values of its length and breadth as parameters of its constructor and
//      having a method named 'returnArea' which returns the area of the rectangle.
//      Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;

public class Rectangles2 {
    // constructor
    int length;
    int breadth;

    public Rectangles2(int l, int b){
        length = l;
        breadth = b;
    }

    public int getArea(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int l;
        int b;

        System.out.println("Enter the length: ");
        l = Input.nextInt();
        System.out.println("Enter the Breadth: ");
        b = Input.nextInt();

        Rectangles2 total = new Rectangles2(l, b);
        System.out.println("Area: " +total.getArea());
    }
}
