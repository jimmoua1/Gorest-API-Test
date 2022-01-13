package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan Ah Teck");
        System.out.println(c1);  // Customer's toString()

        System.out.println(c1);
        System.out.println("id is: " + c1.getID());
        System.out.println("name is: " + c1.getName());
        System.out.println("Gender is: " + c1.getGender('m'));

        // Test Account class
        Account account = new Account(101, c1);
        System.out.println(account);

        System.out.println("id is: " + account.getId());
        System.out.println("customer is: " + account.getCustomer());
        System.out.println("amount is: " + account.getBalance());
        System.out.println("customer's id is: " + account.getId());
        System.out.println("customer's name is: " + account.getCustomerName());
        System.out.println("customer's deposit is: " + account.deposit(320));
        System.out.printf("customer's after withdrawn is: %.2f%n", account.withdraw(270.21));
    }
}
