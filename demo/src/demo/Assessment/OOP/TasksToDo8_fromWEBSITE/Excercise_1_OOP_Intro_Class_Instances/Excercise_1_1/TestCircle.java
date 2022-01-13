package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_1;

/**
 *  A Test Driver for the Circle class
 */
public class TestCircle {  // Save as "TestCircle.java"
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        //The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        //The circle has radius of 2.0 and area of 12.566370614359172

//  -----------------------------------------------------------------------------------
        // 1
        Circle c3 = new Circle(1.0, "Blue");
        System.out.println("Testing Circle (Third Constructor): " + "\n Radius: " + c3.getRadius() + "\n Area: " + c3.getArea());

        // 2
        c3.getColor();
        System.out.println(c3.getColor());

        // 3
        // System.out.println(c1.radius);
        // System.out.println(c1.radius=5.0);
            // Cannot Access(Change), where Circle.java file "Private" is not
            //  allowed to be accessible outside file.

        // 4
        Circle c4 = new Circle();   // construct an instance of Circle
        c4.setRadius(5.5);          // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("green");       // Change color
        System.out.println("color is: " + c4.getColor());   // Print color via getter

        // You cannot do the following because setRadius() returns void, which cannot be printed
        //  System.out.println(c4.setRadius(4.4));

        // 6
        Circle c5 = new Circle();
        System.out.println(c5.toString()); // explicit call

        Circle c6 = new Circle();
        System.out.println(c6.toString()); // explicit call
        System.out.println(c6);            // pinrtln() calls toString() implicity, same as above
        System.out.println("Operator '+' invokes toString() too: " +c6); // '+' invokes toString() too
















    }
}
