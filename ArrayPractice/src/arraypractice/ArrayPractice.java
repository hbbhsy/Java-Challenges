package arraypractice;

import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i=0; i<array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i<array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i=0; i<array.length; i++) {
            String item = array[i];
            System.out.print(item);
            if (i<array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Java index start from 0
        // Declaring
        int[] intArray1;
        // Allocation
        int[] intArray2 = new int[4]; // 4 is the size of the array
        printArray(intArray2);
        // Initializing
        int[] intArray3 = {5, 2, 9, 1, 3}; // need to be all the same datatype

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
