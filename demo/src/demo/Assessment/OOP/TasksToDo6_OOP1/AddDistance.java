//11. Add two distances in inch-feet by creating a class named 'AddDistance'.

package demo.Assessment.OOP.TasksToDo6_OOP1;

public class AddDistance {
    public int getDistance(int c, int d){
        // Inch = c + d
        // Feet = c + d + (c / 12)
        // Distance = inch + feet

        int inches = c + d;
        int feet = c + d + (c / 12);
        int total = inches + feet;
        return total;
    }

    public String toString(){
        return "Distance is: " +getDistance(1, 2);
    }

    public static void main(String[] args) {
        AddDistance num1 = new AddDistance();
        System.out.println(num1.toString());
    }
}

