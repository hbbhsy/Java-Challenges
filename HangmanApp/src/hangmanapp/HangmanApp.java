package hangmanapp;

import java.util.Scanner;

public class HangmanApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman!");
        System.out.println();
        System.out.println("Rule: blablabla.");

        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            // keep playing
            while (!game.gameOver()) {

            }

            // Play or not?
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y/N");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');

        }
    }
}
