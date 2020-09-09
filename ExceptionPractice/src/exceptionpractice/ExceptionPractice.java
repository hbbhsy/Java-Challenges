package exceptionpractice;

public class ExceptionPractice {

    public static void main(String[] args) {
//        // 1. Checked exceptions: syntax
//        int[] intArray = new int[10];
//        // 2. Unchecked exceptions happens during execution
//        System.out.println(intArray[10]);

        // try-catch
        // What if you have random index?
        // try-catch is an easy safe-guard against bad input
        try {
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e); // e is the error message
        }

        try {
            int[] c = new int[6];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e); // e is the error message
        }
        finally {
            System.out.println("Finally clause");
        }
    }
}
