package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_6;

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint();  // Test constructor
        System.out.println(p1);      // Test toString()
        p1.setX(8);   // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX());  // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);   // Test setXY()
        System.out.println(p1.getXY()[0]);  // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));    // which version?       - distance(MyPoint another)
        System.out.println(p2.distance(p1));    // which version?       - distance(MyPoint another)
        System.out.println(p1.distance(5, 6));  // which version? - distance(int x, int y)
        System.out.println(p1.distance());      // which version?       - distance()


        System.out.println("------------------------------------");

        // Looping

        MyPoint[] points = new MyPoint[10];  // Declare and allocate an array of MyPoint
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);    // Allocate each of MyPoint instances;
        }
        // use a loop to print all the points
        System.out.println(Arrays.toString(points));
    }
}
