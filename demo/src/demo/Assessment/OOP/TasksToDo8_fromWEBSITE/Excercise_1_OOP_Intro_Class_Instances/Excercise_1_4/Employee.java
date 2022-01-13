package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_4;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // getter
    public int getID(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    // setter
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int raiseSalary(int percent){
        int total = 100 + salary - 1;
        return total;
    }

    public String toString(){
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + (salary + 99 ) + "]";
    }
}
