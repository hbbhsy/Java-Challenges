

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
         * This method is to de
         * @Param int spot This is the spot the user wants to play, need to validate the spot
         * @Return boolean This is whether is the user's turn to play
         * */
        boolean isValid = withinRange(spot) $$ ! isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return isValid;


    }
}
