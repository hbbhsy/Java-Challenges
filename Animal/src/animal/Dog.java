package animal;

public class Dog extends Animal {

    public Dog(int age) {
        super(age); // Referencing the constructor
        System.out.println("A dog has been created.");
    }


    // Override the superclass method in Animal
    public void sleep() {
        System.out.println("A dog is sleeping.");
    }
    public void eat() {
        System.out.println("A dog is eating.");
    }

    public void ruff() {
        System.out.println("Ruff!");
    }

    public void run() {
        System.out.println("A dog is running.");
    }
}
