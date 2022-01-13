package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_5;


import demo.notes.OOP.MathMethods;

import java.text.DecimalFormat;

//
public class Account {
    int id;
    Customer customer;
    double balance = 0.0;

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName(){
        return customer.name;
    }

    public double deposit(double amount){
        return amount + balance;
    }

    public double withdraw(double amount){
        if (balance >= amount) {
            return amount - balance;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return amount;
    }

    public String toString() {
        return "name" + "(" + id + ")" +
                ", customer=" + customer +
                ", balance=$" + balance;
    }
}
