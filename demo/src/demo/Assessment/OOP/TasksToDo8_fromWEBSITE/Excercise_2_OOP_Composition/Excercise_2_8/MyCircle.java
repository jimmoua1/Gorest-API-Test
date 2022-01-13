package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_8;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){}

    public MyCircle(int x, int y, int radius){
        this.radius = radius;
        this.center = new MyPoint(x, y);
    }

    // getter
    public int getRadius() {
        return this.radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public int[] getCenterXY() {
        return this.center.getXY();
    }

    // setter
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }

    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center + "]";
    }
}
