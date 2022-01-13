package demo;

public class DataTypes {

    public static void main(String[] args) {
        // primitive data types
        // int, long, float, double, char, boolean

        addition(1,2);
        subtraction(0.1f,0.11d);
        multiply(4, 3);
        divide(12,4);


        char e = 'e';
        String str = "Hello";

        System.out.println(str + e);

        boolean flag = false;


        // non - primitive data types
        //String, Object

        String st = new String();
        Object o = new Object();

        // Arrays
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
    }

    public static void addition(int a, long b){
        long c = a + b;
        System.out.println("Addition of 2 number : " + c);
    }

    public static void subtraction(float d, double e){
        double f = d - e;
        System.out.println("Subtraction of decimal is = " + f);
    }

    public static void multiply(float f, double g){
        double j = f * g;
        System.out.println("Multiply of decimal is = " + j);
    }

    public static void divide(float h, double i){
        double k = h / i;
        System.out.println("Divide of decimal is = " + k);
    }
}




