package demo.notes.OOP;

public class OOP_Employee {
    String firstName;
    String lastName;

    public void setFirstName(String name){
        firstName = name;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}

class QA{
    public static void main(String[] args) {
        OOP_Employee jim = new OOP_Employee();
        jim.setFirstName("Jim");
        jim.setLastName("Moua");

        OOP_Employee sarath = new OOP_Employee();
        jim.setFirstName("Sarath");
        jim.setLastName("E");


    }
}
