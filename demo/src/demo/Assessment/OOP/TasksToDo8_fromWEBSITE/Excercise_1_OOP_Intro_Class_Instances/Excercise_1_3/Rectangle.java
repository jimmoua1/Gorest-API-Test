package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_3;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // getter
    public float getLength(){
        return length;
    }

    public float getWidth(){
        return width;
    }

    // setter
    public void setLength(float length){
        this.length = length;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return 2 * (width + 2) * length;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    public String toString(){
        return "Rectangle[length=" + length + "width=" + width + "]";
    }
}
