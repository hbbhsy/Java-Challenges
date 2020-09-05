// Abstract methods vs. Override methods
// With Abstract class, a method may not be defined
// With Override method, there is an implementation at a superclass level


package animal;

public abstract class Animal { // Can't instantiate abstract class

    private int age;// public vs private int age; // for private dog can't access this property

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat(); // abstract method

    // Can be override by the same method in Dog class since Dog is child class
    public void sleep() {
        System.out.println("Animal sleeping.");
    }

    // Public getter can access private variables
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog d = new Dog(15);
        Cat c = new Cat(5);
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        // Casting
        // In case when you want to make sure the object you created before is the
        // right class
        Object dog = new Dog(3); // We will lose all the dog methods
        Dog realDog = (Dog) dog; // Cast dog back to Dog class
        realDog.ruff();

//        Object str = "est";
//        String realS = (String) str;
//        realS.getBytes();

        Dog doggy = new Dog(3);
        if (doggy instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();

        // What happens if...
//        Animal o = new Dog(5);// Ok, but o can access the methods of dog
//        Dog c = new Animal(5); // Not ok.

    }
}
