package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_8;

public class TestMyCircle {
    public static void main(String[] args) {
        // Testing MyPoint(begin, end)
        MyPoint l1 = new MyPoint();
        System.out.println(l1);

        // Testing MyCircle;
        MyCircle l2 = new MyCircle();
        System.out.println(l2);
        MyCircle l3 = new MyCircle(1,1,4);
        System.out.println(l2);

        l3.getRadius();
        l3.getCenter();
        l3.getCenterX();
        l3.getCenterY();
        l3.getCenterXY();
        l3.setRadius(4);
        l3.setCenter(l1);
        l3.setCenterX(1);
        l3.setCenterY(2);
        l3.setCenterXY(2,1);
        l3.getCircumference();
        l3.distance(l3);
        System.out.println(l3);   // toString()
    }
}
