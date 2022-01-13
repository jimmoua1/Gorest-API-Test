package demo.Assessment.OOP.TasksToDo6_OOP1;

// 4. Write a program to print the area and perimeter of a triangle having sides
//      of 3, 4 and 5 units by creating a class named 'Triangle' without
//            any parameter in its constructor.

public class Triangle {
    int a;
    int b;
    int c;

    public int getPerimeter(){
        // Perimeter = a + b + c
        int total = (a + b + c) / 2;
        return total;
    }

    public double getArea(){
        // Area = 1/2 | (0.5) * Base * Height
        int p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    public static void main(String[] args) {
        Triangle result = new Triangle();
        result.a = 3;
        result.b = 4;
        result.c = 5;

        System.out.println(result.getPerimeter());
        System.out.println(result.getArea());
    }
}
