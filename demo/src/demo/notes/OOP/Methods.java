package demo.notes.OOP;

public class Methods {
    // with void - no return at end of function required
    // without void - required returns
    static int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
