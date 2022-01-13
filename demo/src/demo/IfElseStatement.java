package demo;

public class IfElseStatement {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if(a == b){
            System.out.println("both are equal");
        } else {
            System.out.println("both are not equal");
        }

        if (a == b){
            System.out.println("both are equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is lesser than b");
        }

        // nested if
        if (a >= b){
            if (a == b){
                System.out.println("both are equal");
            } else {
                System.out.println("both are not equal");
            }
        }

//       && and     ||  Or
//            if (1 > 0 && 1 < 0){
//
//            }
//
//            if (1 > 0 || 0 < 1){
//                System.out.println("Test");
//            }
//
//            //       a++ == is a = a + 1
//            //    if (a % 2 == 0) {
//            //    }
//
//            int a = 1;

    }
}
