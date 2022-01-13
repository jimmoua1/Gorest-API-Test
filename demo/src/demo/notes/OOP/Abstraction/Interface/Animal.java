package demo.notes.OOP.Abstraction.Interface;
// ------- Abstract -----
//abstract class Animal {
//    // Abstract method (does not have a body)
//    public abstract void animalSound();
//
//    // Regular method
//    public void sleep(){
//        System.out.println("Zzz");
//    }
//}

// Interface is like a template (enforced)
interface Animal {
    final int a = 10;
    public void animalSound(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)
}

    // Pig "implements" the Animal interface
    //       Can have more than one class after "implements"
    class Pig implements Animal{

        public void animalSound(){
            // calling a from Parent, variable cannot be changed
            System.out.println(a);

        }

        public void run(){
            System.out.println("Pig running!");
        }
}


class Test {
    public static void main(String[] args) {
        Animal myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.run();
    }
}