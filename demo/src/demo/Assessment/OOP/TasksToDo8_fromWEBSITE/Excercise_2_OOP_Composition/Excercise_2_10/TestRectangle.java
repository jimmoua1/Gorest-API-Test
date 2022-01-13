package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_10;

public class TestRectangle {
    public static void main(String[] args) {
        // Testing MyPoint(begin, end)
        MyPoint l1 = new MyPoint();
        System.out.println(l1);

        // Testing MyTriangle;
        MyRectangle l2 = new MyRectangle(1,1,2,2);
        System.out.println(l2);

        MyPoint a = new MyPoint(4,4);
        MyPoint b = new MyPoint(5,5);
        MyRectangle l3 = new MyRectangle(a,b);
        System.out.println(l3);

        // perimeter
        System.out.println(l2.getPerimeter());
        // getType of Triangle
        System.out.println(l2.getType());
        System.out.println(l2);   // toString()
    }
}
