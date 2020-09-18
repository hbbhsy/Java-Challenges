package generics;

// Create a method to be able to find the maximum of two values
// Here <E> denotes the type parameter of Node class .
// The type parameter defines that it can refer to any type (like String, Integer, Employee etc.).
// Java generics have type parameter naming conventions like following:
// T - Type
// E - Element
// K - Key
// N - Number
// V - Value
// D - Data
// S,U,V etc. - 2nd, 3rd, 4th types
// By convention, type parameter names are single, uppercase letters.
// This stands in sharp contrast to the variable naming conventions
// that you already know about, and with good reason: Without this convention,
// it would be difficult to tell the difference between a type variable and an ordinary
// class or interface name. The most commonly used type parameter names are:


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
