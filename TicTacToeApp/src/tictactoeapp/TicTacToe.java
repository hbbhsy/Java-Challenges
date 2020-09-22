

package tictactoeapp;

public class TicTacToe {

    // Picture of Game with Index;
    // FOR STORAGE:
    // 0 | 1 | 2
    // ----------
    // 3 | 4 | 5
    // ----------
    // 6 | 7 | 8

    // WHAT THE USER THINKS:
    // 1 | 2 | 3
    // ----------
    // 4 | 5 | 6
    // ----------
    // 7 | 8 | 9

    // UI Picture of Game:
    // INIT:
    // | - | - | - |
    // -------------
    // | - | - | - |
    // -------------
    // | - | - | - |

    // GAMEPLAY
    // | 0 | - | 0 |
    // -------------
    // | - | X | - |
    // -------------
    // | - | - | X |


    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    // Constructor
    public TicTacToe(char playerToken, char aiMarker) {
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
    }

    public static char[] setBoard() {
        /**
         * This method is to set the initial board.
         * Each board spot on the board is represented by '-'.
         * @Return char[] This return the empty board
        */
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    //
    public boolean playTurn(int spot) {
        /**
         * This method is to check whether is the user's turn to play
         * @Param int spot This is the spot the user wants to play, need to validate the spot
         * @Return boolean This is whether is the user's turn to play
         * */
        boolean isValid = withinRange(spot) && ! isSpotTaken(spot); // Check if the spot is within the range and if the spot is taken(False = not taken)
        if (isValid) {
            board[spot - 1] = currentMarker; // The index is spot(what user see) - 1
            // If the currentMarker==userMarker, make the currentMarker=aiMarker, otherwise make the currentMarker=userMarker
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker; // If statement in one line
        }
        return isValid;
    }

    // Check if our spot is in range
    public boolean withinRange(int number) {
        return number > 0 && number < board.length + 1;
    }

    // Check if the spot is take
    public boolean isSpotTaken(int number) {
        return board[number-1] != '-'; // if the spot is not '-', it means the spot is taken
    }





}


