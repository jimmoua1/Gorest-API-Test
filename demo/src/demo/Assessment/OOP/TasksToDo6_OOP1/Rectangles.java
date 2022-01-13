package demo.Assessment.OOP.TasksToDo6_OOP1;

// 6. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
//      respectively by creating a class named 'Rectangle' with a method named 'Area'
//    which returns the area and length and breadth passed as parameters to its constructor.

public class Rectangles {
    int length;
    int breadth;

    // Constructor
    public Rectangles(int l, int b){
        length = l;
        breadth = b;
    }

    // Method 1
    public int getPerimeter(){
        return 2 * (length + breadth);
    }

    // Method 2
    public int getArea(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangles one = new Rectangles(4,5);
        Rectangles two = new Rectangles(5, 8);

        System.out.println("Triangle One Perimeter: " + one.getPerimeter() + "\nTriangle One Area: " + one.getArea());
        System.out.println("Triangle Two Perimeter: " + two.getPerimeter() + "\nTriangle Two Area: " + two.getArea());
    }
}
