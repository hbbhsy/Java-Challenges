package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<String, String>();
        dict.put("Monday", "Lunes");
        dict.put("Tuesday", "Martes");
        dict.put("Wednesday", "Miercoles");
        dict.put("Thursday", "Jueves");
        dict.put("Friday", "Viernes");
        dict.put("Saturday", "Sabado");
        dict.put("Sunday", "Domingo");

        // Retrieve things from dict
        System.out.println(dict.get("Monday"));
        System.out.println(dict.get("Tuesday"));
        System.out.println(dict.get("Wednesday"));
        System.out.println(dict.get("Thursday"));
        System.out.println(dict.get("Friday"));
        // Print out all keys
        System.out.println(dict.keySet());
        // Print out all values
        System.out.println(dict.values());
        // Print out size
        System.out.println("The size of our dictionary is "+dict.size());

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        // Print Key-value pairs
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());// is empty?
        // Remove items
        shoppingList.remove("Eggs");
        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);


        // Clear our dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());// is empty?


    }
}
