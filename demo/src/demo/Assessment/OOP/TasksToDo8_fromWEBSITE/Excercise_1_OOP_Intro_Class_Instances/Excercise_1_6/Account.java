package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_6;

public class Account {
    String id;
    String name;
    int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getter
    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // setter
    public int credit(int amount){
        return this.balance += amount;
    }

    public int debit(int amount){
        if(amount <= this.balance){
            return this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount){
        if(amount <= balance){
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public String toString(){
        return "Account[id=" + id + "," + "name=" + name + ",balance=" + balance + "]" ;
    }
}
