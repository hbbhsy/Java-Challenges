package starwarsinterface;

import java.util.Random;

public class StarWarsInterface {

    public static Character summonCharacter() {
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero ObiWan = new Hero();
        darthVader.attack();
        ObiWan.attack();
        darthVader.heal();
        ObiWan.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + ObiWan.getWeapon());

        // Create instance of Charactor
        Character spy = summonCharacter(); // the interface links to the
        spy.attack();
        spy.heal();


    }
}
