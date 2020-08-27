package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class Main {

    int theNumber;
    int max;
    Scanner sc = new Scanner(System.in);

    public Main() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max+1);
    }

    public void play() {
        while(true) {
            int guess = sc.nextInt();
            if (guess > theNumber) {
                System.out.println("Too big!");
            } else if (guess < theNumber) {
                System.out.println("Too small!");
            } else {
                System.out.println("YOU GOT IT!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Main game = new Main();
        System.out.println("Guess a number:");
        game.play();
    }
}
