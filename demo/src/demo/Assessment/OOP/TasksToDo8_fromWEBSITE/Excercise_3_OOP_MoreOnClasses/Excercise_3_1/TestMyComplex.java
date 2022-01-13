package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_3_OOP_MoreOnClasses.Excercise_3_1;

public class TestMyComplex {
    public static void main(String[] args) {
        // Test MyComplex Constructor
        MyComplex test1 = new MyComplex();
        System.out.println(test1);
        // Test MyComplex Second Constructor
        MyComplex test2 = new MyComplex(1, 0);
        System.out.println(test1);


        System.out.println(test1.getReal());
        test1.setReal(4);
        System.out.println(test1);
        System.out.println(test1.getImag());
        test1.setImag(0.11);
        test1.setValue(1,33);
        System.out.println("Is Test1 real number? " +test1.isReal());
        System.out.println("Is Test1 imaginary number? " +test1.isImaginary());
        System.out.println("Test1 is equal to 2,2? " +test1.equals(2,2));
        System.out.println("Test1 is equal to test2? " +test1.equals(test2));
        System.out.println("Magnitude is: " + test1.magnitude());

        System.out.println("Total addNew is: " +test1.addNew(test2));
        System.out.println(test1.argument());                   // argument
        System.out.println(test1.subtract(test2));    // test1 - test2
        System.out.println(test1.subtractNew(test2));    // test1 - test2 (Subtract New)
        System.out.println(test1.Multiply(test2));    // test1 * test2
        System.out.println(test1.Divide(test2));    // test1 / test2
        System.out.println(test1.conjugate());    // test1 - test2


    }
}
