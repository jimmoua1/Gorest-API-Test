package demo.Practice.Loops;

public class Loops {
    public static void main(String[] args) {
        testing();
//        System.out.println(0);
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);

        // for loop
        for (int i = 0; i < 6; i = i + 1){
            System.out.println(i);
        }


        // while loop
        int i = 0;
        while (i < 6){
            System.out.println(i);
            i++;
        }


        // do loop
        do {
            System.out.println(i);
            i++;
        } while (i == 6);

    }

    public static void testing(){

        // for-each loop example
        String s = "JAVA";
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        String[] strings = {"JAVA", "Genspark"};

        System.out.println(strings[0]);
        System.out.println(strings[1]);
        for(int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }

        // For Each Loop here
        for(String str:strings){
            System.out.println(str);
        }

        // Reverse loop
        for(int i = 5; i >= 0; i--){
            System.out.println(i);
        }

        // Reverse loop of "String s = "JAVA" "
        for (int i = s.length() - 1; 1 >= 0; i--){
            System.out.println(s.charAt(i));
        }


//        // Reverse Loop of "String s = "JAVA" "
//        String reverse = "";
//        for (int i = s.length() - 1; i > 0; i--){
//            char c = s.charAt(i);
//            reverse = reverse + c;
//        }
//        System.out.println(reverse);
    }
}
