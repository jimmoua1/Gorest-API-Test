package demo.notes.OOP.Inheritance;

public class Vehicle {
    protected  String brand = "Ford";  // Vehicle attribute

    public void honk(){            // Vehicle method
        System.out.println("Tuut, Tuut!");
    }
}

// "extends" dont support more than one class
// "implement" support this
class Car extends Vehicle {
    private String modeName = "Mustange";    // Car attribute

    public static void main(String[] args) {

        // Create a myCar Object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand
        System.out.println(myCar.brand + " " + myCar.modeName);
    }
}

class Truck extends Vehicle {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.honk();
        System.out.println(truck.brand);
    }
}
