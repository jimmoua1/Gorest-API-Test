// 9. Print the sum, difference and product of two complex numbers
//     by creating a class named 'Complex' with separate methods
//   for each operation whose real and imaginary parts are entered by user.


package demo.Assessment.OOP.TasksToDo6_OOP1;

public class Complex {
    int realNumber;
    int imageNumber;

    public Complex(int a, int b){
        realNumber = a;
        imageNumber = b;
    }

    // Three seoarate Methods
    public static Complex getAddition(Complex a, Complex b){
        return new Complex((a.realNumber + b.realNumber),(a.imageNumber + b.imageNumber));
    }

    public static Complex getDifference(Complex a, Complex b){
        return new Complex((a.realNumber - b.realNumber), (a.imageNumber - b.imageNumber));
    }

    public static Complex getProduct(Complex a, Complex b){
        return new Complex((a.realNumber * b.realNumber), (a.imageNumber * b.imageNumber));
    }

    public void printComplex(){
        if(realNumber == 0 && imageNumber!=0){
            System.out.println(imageNumber+"i");
        }
        else if(imageNumber == 0 && realNumber!=0){
            System.out.println(realNumber);
        }
        else{
            System.out.println(realNumber+"+"+imageNumber+"i");
        }
    }

    public static void main(String[] args) {
        Complex total1 = new Complex(1, 2);
        Complex total2 = new Complex(3, 4);

        Complex add = Complex.getAddition(total1, total2);
        Complex difference = Complex.getDifference(total1, total2);
        Complex Product = Complex.getProduct(total1, total2);

        add.printComplex();
        difference.printComplex();
        Product.printComplex();
    }
}
