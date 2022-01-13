package demo.Assessment.OOP.TasksToDo6_OOP1;

// 2. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
//       Assign the value of roll_no as '2' and that of name as "John"
//        by creating an object of the class Student.

// 3. Assign and print the roll number, phone number and address of two students
//     having names "Sam" and "John" respectively by creating two objects of class 'Student'.

public class Student {
    String name;
    int roll_no;
    String phone_number;
    String address;

    public static void main(String[] args){
        Student Object1 = new Student();
        Student Object2 = new Student();

        Object1.name = "John";
        Object1.roll_no = 1;
        Object1.phone_number = "(123) 123-4567";
        Object1.address = "1234 Street Ave";

        Object2.name = "Sam";
        Object2.roll_no = 2;
        Object2.phone_number = "(456) 789-1111";
        Object2.address = "4321 Circle Ave";

        System.out.println("Student name: " + Object1.name + " \nRoll Number: " + Object1.roll_no + "\nPhone Number: " + Object1.phone_number + "\nStreet Address: " + Object1.address);
        System.out.println("");
        System.out.println("Student name: " + Object2.name + " \nRoll Number: " + Object2.roll_no + "\nPhone Number: " + Object2.phone_number + "\nStreet Address: " + Object2.address);
    }
}
