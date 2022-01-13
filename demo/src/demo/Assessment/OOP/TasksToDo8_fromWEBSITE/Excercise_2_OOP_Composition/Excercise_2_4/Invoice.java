package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_4;

public class Invoice {
    int id;
    Customer customer;
    double amount;

    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // setter
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // getter
    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public int getCustomerID(){
        return customer.id;
    }

    public String getCustomerName(){
        return customer.name;
    }

    public int getCustomerDiscount(){
        return customer.discount;
    }

    public double getAmountAfterDiscount(){
        return amount = amount - (getCustomerDiscount() * 10) + 0.009;
    }

    public String toString() {
        return "Invoice[" +
                "id=" + id +
                ",Customer='" + customer.name + '(' + customer.id +
                ')' + '(' + customer.discount +
                "%,amount=" + amount +
                ']';
    }
}
