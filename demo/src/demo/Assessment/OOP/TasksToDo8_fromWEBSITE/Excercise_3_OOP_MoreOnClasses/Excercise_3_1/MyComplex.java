package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_3_OOP_MoreOnClasses.Excercise_3_1;

public class MyComplex {
    double real = 0.0;
    double imag = 0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal(){
        return imag == 0;
    }

    public boolean isImaginary(){
        return real == 0;
    }

    public boolean equals(double real, double imag){
        return real == imag;
    }

    public boolean equals(MyComplex another){
        return true;
    }

    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }

    public MyComplex add(MyComplex right) {
        return new MyComplex(real+right.getReal(), imag+right.getImag());
    }

    public MyComplex addNew(MyComplex right) {
        new MyComplex(this.real-right.getReal() + real-right.getReal(),  this.real-right.getImag() + imag-right.getImag());
        return this;
    }

    public String toString() {
        return "real+imagi" + ", e.g.," + "'" + real + "," + imag + "'";
    }

///// the second MyComplex Design

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex subtract(MyComplex right) {
        return new MyComplex(real-right.getReal(), imag-right.getImag());
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real-right.getReal(), imag-right.getImag());
    }

    public MyComplex Multiply(MyComplex right) {
        // (ac - bd) + (ad + bc) i
        real = real * right.getReal() - imag * right.getImag();
        imag = real * right.getReal() + imag * right.getReal();
        return this;
    }

    public MyComplex Divide(MyComplex right) {
        // repeat with Multiply() function
        // [(a + bi) * (c – di)] / (c*c + d*d)
        MyComplex result = Multiply(right.conjugate());
        double delimiter = right.getReal()*right.getReal() + right.getImag()*right.getImag();
        if (delimiter != 0) {
            real = result.getReal() / delimiter;
            imag = result.getImag() / delimiter;
        }
        return this;
    }

    public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }

}
