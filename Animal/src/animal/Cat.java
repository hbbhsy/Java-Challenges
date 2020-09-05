package animal;

public class Cat extends Animal {

    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created.");

    }

    public void eat() {
        System.out.println("A cat is eating");
    }
    public void meow() {
        System.out.println("Meowww~");
    }

    public void prance() {
        System.out.println("A cat is prancing.");
    }


}
