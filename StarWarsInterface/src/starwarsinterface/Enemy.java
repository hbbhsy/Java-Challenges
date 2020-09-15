package starwarsinterface;

// Class that implements interface
public class Enemy implements Character {

    public String weapon = "lightsaber";

    public Enemy() {

    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks YOU!");
    }
    @Override
    public void heal() {
        System.out.println("The enemy heals himself.");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    public void weaponDraw() {
        System.out.println("draw out weapon");
    }



}
