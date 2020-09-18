package arraypractice;

import java.util.Arrays;
import java.lang.reflect.Array;

public class ArrayPractice {

    public static <E> void printArray(E[] array) {
        // E can be any types of elements
        // E is automatically an object, need to be initialized using objects, not data types
        System.out.print("[");

        for (E element : array) {
            System.out.println(element + " ");
        }
    }

//    public static void printArray(String[] array) {
//        System.out.print("[");
//        for (int i=0; i<array.length; i++) {
//            String item = array[i];
//            System.out.print(item);
//            if (i<array.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }

    public static void main(String[] args) {
        // Java index start from 0
        // Declaring
        Integer[] intArray1; // instead of int, use Integer coz it's an object
        // Allocation
        Integer[] intArray2 = new Integer[4]; // 4 is the size of the array
        printArray(intArray2);
        // Initializing
        Integer[] intArray3 = {5, 2, 9, 1, 3}; // need to be all the same datatype

        String[] shoppingList = {"banana", "apple", "pear"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10; // You can have duplicate in array

        // Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println();

        // Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);

        // Print string array;
        printArray(shoppingList);

        System.out.println("Special for loop:");
        // Special for loop: foreach
        for (String s : shoppingList) {
            System.out.println("Hi");
        }
    }
}
