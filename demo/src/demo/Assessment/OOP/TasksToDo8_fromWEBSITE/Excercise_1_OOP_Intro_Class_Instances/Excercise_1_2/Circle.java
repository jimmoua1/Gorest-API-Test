package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_2;

// 1. Write a Circle Class
public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    // setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    // getter
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    // toString
    public String toString(){
        return "Circle[radius="+ radius + "]";
    }


}
