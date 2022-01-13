package demo.notes.collection;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);

        // The catch statement allows you to-define a block of code to be executed, if an error occurs in the try block.
        //     if "NullPointerException" only catch Null point Exception
        } catch (NullPointerException error1) {
            System.out.println("Something went wrong");
            System.out.println(error1.getMessage());
        } catch (ArrayIndexOutOfBoundsException error2){
            System.out.println(error2.getMessage());

        // the finally statement lets you execute code after try ...catch. regardless of the result.
        } finally {
            System.out.println("The try catch is finished");
        }
    }
}
