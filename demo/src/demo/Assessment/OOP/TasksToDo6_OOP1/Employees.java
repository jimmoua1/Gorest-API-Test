// 10. Write a program that would print the information (name, year of joining, salary, address)
//        of three employees by creating a class named 'Employee'.
//                 The output should be as follows:
//        Name        Year of joining        Address
//        Robert            1994                64C- WallsStreat
//        Sam                2000                68D- WallsStreat
//        John                1999                26B- WallsStreat

package demo.Assessment.OOP.TasksToDo6_OOP1;

public class Employees {
    String Name;
    String Year;
    String Address;

    public String getName(String Name){
        return Name;
    }

    public String getYear(String Year){
        return Year;
    }

    public String getAddress(String Address){
        return Address;
    }

    public String toString1(){
        return getName(" Robert ") + getYear("      1994 ") + getAddress("         64C-WallsStreat ");
    }

    public String toString2(){
        return getName(" Sam   ") + getYear("       2000 ") + getAddress("         68D-WallsStreat ");
    }

    public String toString3(){
        return getName(" John   ") + getYear("      1999 ") + getAddress("         26B-WallsStreat ");
    }

    public static void main(String[] args) {
        Employees first = new Employees();
        Employees second = new Employees();
        Employees third = new Employees();

        System.out.println("  Name    Year of joining      Address");
        System.out.println("  ====    ==============       =======");
        System.out.println(first.toString1());
        System.out.println(second.toString2());
        System.out.println(third.toString3());
    }
}
