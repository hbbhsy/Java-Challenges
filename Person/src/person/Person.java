package person;

// Pointer
// Enum
// Alias

import static person.HairColor.*;

public class Person {

    HairColor hairColor = BLACK;

    public Person(){

    }

    public static void main(String[] args) {
        Person PeterParker = new Person();
        Person SpiderMan = PeterParker;

        PeterParker.hairColor = PINK; // Aliasing, call by reference

        System.out.println("Hair color or Peter Parker: " + PeterParker.hairColor);
        System.out.println("Hair color of SpiderMan: " + SpiderMan.hairColor);

    }
}
