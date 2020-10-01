package hangmanapp;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApp {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman!");
        System.out.println();
        System.out.println("Rule: blablabla.");

        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            // keep playing
            System.out.println("Let's play!");
            Hangman game = new Hangman();

            do {
                // Draw the things;
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
            }
            while (!game.gameOver());

            // Play or not?
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y/N");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');

        }
    }
}
