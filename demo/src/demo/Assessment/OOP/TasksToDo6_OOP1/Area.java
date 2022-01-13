package demo.Assessment.OOP.TasksToDo6_OOP1;
import java.util.Scanner;

//1. Write a program to print the area of a rectangle by creating
// a class named 'Area' having two methods. First method named as 'setDim'
// takes length and breadth of rectangle as parameters and the second method
// named as 'getArea' returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.

public class Area {
    int length;
    int breadth;

    public Area(int a, int b){
        length = a;
        breadth = b;
    }

    // Method 1
    public int setDim(){
        int total = length * breadth;
        return total;
    }


    // Method 2
    public void getArea(){
        System.out.println("Area = " + setDim());
    }

    public static void main(String[] args) {
        Scanner Parameter = new Scanner(System.in);
        System.out.println("Input two number: ");
        int l = Parameter.nextInt();
        int b = Parameter.nextInt();
        Area total = new Area(l , b);
        total.getArea();
    }
}



