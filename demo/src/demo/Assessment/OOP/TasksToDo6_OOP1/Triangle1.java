// 5. Write a program to print the area and perimeter of a triangle having
//        sides of 3, 4 and 5 units by creating a class named 'Triangle'
//        with constructor having the three sides as its parameters.

package demo.Assessment.OOP.TasksToDo6_OOP1;

public class Triangle1 {
    // Class Constructor
    public Triangle1(){
        // Perimeter
        int a = 3;
        int b = 4;
        int c = 5;

        // Area
        int l = 1;
        int h = 2;
    }

    // Method 1
    int getPerimeter(int a, int b, int c){
        int Perimeter = (a + b + c) / 2;
        return Perimeter;
    }

    // Method 2
    int getArea(int l, int h){
        int Area = l * h;
        return Area;
    }

    public static void main(String[] args) {
        Triangle1 result = new Triangle1();

        System.out.println(result.getPerimeter(3,4,5));
        System.out.println(result.getArea(1,2));
    }
}
