package demo;

public class Task2Test {
    public static void main(String[] args) {
        String word = "tested";
//        for(int i = 0; i < word.length() ; i++){
//            System.out.println(word.charAt(i));
//        }
        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--){
            System.out.println(word.charAt(i));
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)){

        }

    }
}
