package demo;

public class Switch {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;


        if(a == b){
            System.out.println("both are equal");
        } else {
            System.out.println("both are not equal");
        }

        if (a == b){
            System.out.println("both are equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else if (a >= b) {
            System.out.println("a is greater equal than b");
        } else if (a <= b) {
            System.out.println("a is lesser equal than b");
        }

        // Too many If/else statement? do Switch

        switch (c){
            case 3:
                System.out.println("value of c is: " +3);
                break;
            case 10:
                System.out.println("value of c is: " +10);
                break;
            case 20:
                System.out.println("value of c is: " +20);
                break;
            default:
                System.out.println("default line");
                break;
        }





    }
}

