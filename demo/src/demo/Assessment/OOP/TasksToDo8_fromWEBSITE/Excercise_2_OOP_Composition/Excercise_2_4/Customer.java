package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_4;

public class Customer {
    int id;
    String name;
    int discount;

    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount * 10;
    }

    // getter
    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    // setter

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}
