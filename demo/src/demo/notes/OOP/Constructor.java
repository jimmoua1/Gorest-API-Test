package demo.notes.OOP;

public class Constructor {
    int x;

    public Constructor(int a){
        x = a;
    }

    public static void main(String[] args) {
        Constructor myObj1 = new Constructor(1); // Object 1
        System.out.println(myObj1.x);
    }
}
