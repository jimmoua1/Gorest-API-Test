package demo.notes.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "john";
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}
