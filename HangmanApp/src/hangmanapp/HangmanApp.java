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
                System.out.println();

                // Get the guess
                System.out.println("Enter a character:");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();

                // Check if the character is guessed already
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }

                // Play the game
                if (game.playGuess(guess)) {
                    System.out.println("Great guess!");
                } else {
                    System.out.println("Wrong guess.");
                }

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
