package starwarsinterface;

// Interfaces: A collection of abstract methods
// * Template of functionality
//     1. No implementations
//     2. No constructors


// - Interfaces can extend other interfaces: same as classes
// - Interfaces are all about functionality!
// - The only way to use an interface is to create a class that implements that interface
//   You can't instantiate just an interface

// Character interface
public interface Character {
    public String base = "character";
    public void attack();
    public void heal();
    public String getWeapon();

}
