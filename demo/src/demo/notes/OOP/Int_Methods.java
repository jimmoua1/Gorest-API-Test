package demo.notes.OOP;

public class Int_Methods {
    int x = 5;
    static int y = 5;

    public static void main(String[] args) {
        Int_Methods myObj1 = new Int_Methods();
        Int_Methods myObj2 = new Int_Methods();
        Int_Methods myObj3 = new Int_Methods();
        myObj1.x = 10;

        // will NOT overwrite myObj3 because "int y = 5" is Static
        myObj3.y = 10;

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        System.out.println(myObj3.x);
    }
}
