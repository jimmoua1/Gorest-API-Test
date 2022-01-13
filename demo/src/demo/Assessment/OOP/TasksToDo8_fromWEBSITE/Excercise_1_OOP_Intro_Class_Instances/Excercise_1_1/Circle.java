package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_1;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

//----- 5. keyword "this" to class and setter -----//

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() {  // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius) {  // 2nd constructor
        this.radius = radius;
        color = "red";
    }

//----- 1. Third Constructor Circle -----//
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
//----------------------------------------//

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

//----- 2. Getter for Color -----//
    public String getColor(){
        return color;
    }
//------------------------------//


//----- 4. Setter for Radius and Color -----//
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }
//------------------------------------------//


//----- 6. Method to String -----//
    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
//-------------------------------//



}

