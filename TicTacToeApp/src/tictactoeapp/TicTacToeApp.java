package tictactoeapp;

import java.util.Scanner;

public class TicTacToeApp {

    public static void main(System[] args) {
        Scanner sc = new Scanner(System.in);
        // Allows for cont.games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            System.out.println("Welcome!" + "Pick a character.");
            System.out.println();
            System.out.println("Enter a single character represents you.");
            char playerToken = sc.next().charAt(0); // Only take the first char (index 0)from the next input
            System.out.println("Enter a single character represents your opponent");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            // Set up the game;
            System.out.println();
            System.out.println("Game Started: enter a spot number from 1-9.");
            game.printIndexBoard();
            System.out.println();

            // Let's play
            while (game.gameOver().equals("Not Over")) {
                if (game.currentMarker == game.userMarker) {
                    // User turn
                    System.out.println("It's your turn. Enter a spot:");
                    int spot = sc.nextInt();
                    while(!game.playTurn(spot)) {
                        System.out.println("Try again. "+spot+" is already taken or out of range");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked "+spot+"!");
                } else {
                    // AI turn
                    System.out.println("It's my turn!");
                    //
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked "+aiSpot+"!");
                }
                // Print out new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            System.out.println("Play again? Y/N");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response=='Y');
            System.out.println();
            System.out.println();
        }
    }

}
