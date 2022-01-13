package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Testing MyPoint(begin, end)
        MyPoint l1 = new MyPoint();
        System.out.println(l1);

        // Testing MyTriangle;
        MyTriangle l2 = new MyTriangle(1,1,2,2,3,3);
        System.out.println(l2);

        MyPoint a = new MyPoint(4,4);
        MyPoint b = new MyPoint(5,5);
        MyPoint c = new MyPoint(6,6);
        MyTriangle l3 = new MyTriangle(a,b,c);
        System.out.println(l3);

        // perimeter
        System.out.println(l2.getPerimeter());
        // getType of Triangle
        System.out.println(l2.getType());
        System.out.println(l2);   // toString()
    }
}
