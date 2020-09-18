package generics;

// Create a method to be able to find the maximum of two values
public class Generics implements Comparable{

    public static <T extends Comparable<T>> T findMax(T a, T b) {
        // T is going to be some type of data that have a compare-to function, this is to make sure
        // your data obviously has this compare-to method
        int n = a.compareTo(b); // return -1 if a<b, 0 if a=b, 1 if a>b
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(2,3));
        System.out.println(findMax('a','b'));
        System.out.println(findMax("hello", "there"));

        // Generics has to implements Comparable in the Class define line
        // and implements the abstract method to make the following lines work.
        // Only implements and not implements in the class head line, it will not work
        Generics k = new Generics();
        System.out.println(findMax(k,k));

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
