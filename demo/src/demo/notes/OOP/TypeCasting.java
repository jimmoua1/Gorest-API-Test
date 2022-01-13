package demo.notes.OOP;

public class TypeCasting {
    public static void main(String[] args) {
        // Narrow Cast
        int myInt = 9;

        // Widen Cast - here automatic cast to double
        double myDouble = myInt;

        // Widen Cast - here manual
        int myInt1 = (int) myDouble;

        System.out.println(myInt1);    // Outputs 9 (convert int to double)
        System.out.println(myInt);     // Outputs 9
        System.out.println(myDouble);  // Outputs 9.0
    }
}
