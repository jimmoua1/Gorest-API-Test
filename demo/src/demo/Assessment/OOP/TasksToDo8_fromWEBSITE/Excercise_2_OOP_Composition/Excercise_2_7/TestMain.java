package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_7;

public class TestMain {
    public static void main(String[] args) {
        // Testing MyPoint(begin, end)
        MyPoint l1 = new MyPoint();
        System.out.println(l1);

        MyLine l2 = new MyLine(1,1,2,2);
        System.out.println(l2);

        l2.getBegin();
        l2.getEnd();
        l2.setBegin(l2.getBegin());
        l2.setEnd(l2.getEnd());
        l2.setBeginX(5);
        l2.setBeginY(0);
        l2.setBeginXY(3,2);
        l2.setEndX(5);
        l2.setEndY(2);
        l2.setEndXY(5,5);
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
        System.out.println(l2);   // toString()
    }
}
