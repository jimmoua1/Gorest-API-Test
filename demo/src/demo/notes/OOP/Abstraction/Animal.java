package demo.notes.OOP.Abstraction;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}


// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound(){
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void name(){
        System.out.println("hello");
    }
}

class Main{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}