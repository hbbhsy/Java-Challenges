package animal;

public class Animal {

    private int age;// public vs private int age; // for private dog can't access this property

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public void eat() {
        System.out.println("An animal is eating!");
    }

    // Public getter can access private variables
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog(15);
        Cat c = new Cat(5);
        d.ruff();
        System.out.println(d.age);
        c.meow();
        System.out.println(c.age);
        d.eat();
        c.eat();
        d.run();
        c.prance();

        // What happends if...
//        Animal o = new Dog(5);// Ok, but o can access the methods of dog
//        Dog c = new Animal(5); // Not ok.

    }
}
