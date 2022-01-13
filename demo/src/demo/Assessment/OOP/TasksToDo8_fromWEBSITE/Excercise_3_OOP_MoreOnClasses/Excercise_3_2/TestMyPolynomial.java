package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_3_OOP_MoreOnClasses.Excercise_3_2;

public class TestMyPolynomial {
    public static void main(String[] args) {
        // Given Tests
        //---------------------------------------------------------
        // Can invoke with a variable number of arguments
        double[] p1Test = {1.1,2.2,3.3};
        MyPolynomial p1 = new MyPolynomial(p1Test);
        double[] p2Test = {1.1, 2.2, 3.3, 4.4, 5.5};
        MyPolynomial p2 = new MyPolynomial(p2Test);
        // Can also invoke with an array
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial p3 = new MyPolynomial(coeffs);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("---------------------------");
        //---------------------------------------------------------

        // Test MyPolynomial Constructor
        double[] tester = {1, 2, 3, 4, 5};
        MyPolynomial test1 = new MyPolynomial(tester);
        System.out.println(test1);

        // Test more Methods
        System.out.println("Evaluated Test1: " +test1.evaluate(2));
        System.out.println("Add is: " +test1.add(test1));
        System.out.println("Multiply is: " +test1.multiply(test1));

    }
}



// Question: Do you need to keep the degree of the polynomial as an instance
//     variable in the MyPolynomial class in Java? How about C/C++? Why?

// Only in Java at this problem, no, you do not need to be kept as an instance variable.
//  Because whenever you need it just call the getDegree() function.