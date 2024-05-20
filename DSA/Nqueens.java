import java.util.ArrayList;
import java.util.List;

public class Nqueens {

    boolean isSafe(int row, int col, char[][] board) {
        // Checking Horizontally
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Checking Vertically
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Checking Diagonally Up left
        int i = row;

        for (int j = col; (i >= 0 && j >= 0); i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Checking Diagonally Downward right
        i = row;
        for (int j = col; (j < board[0].length && i < board.length); i++, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Checking Diagonally Upward Right
        i = row;
        for (int j = col; (i >= 0 && j < board.length); i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Checking Diagonally Downward Left
        i = row;
        for (int j = col; (j >= 0 && i < board.length); j--, i++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
     return true;
    }

    void helper(char board[][], int col, List<List<String>> allBoards) {
        if (col == board.length) {

            // write a function to save a board in all boards
            return;
        } else {
            for (int row = 0; row < board.length; row++) {
                if (isSafe(row, col, board)) {
                    board[row][col] = 'Q';
                    helper(board, col + 1, allBoards);
                }
            }
        }
    }

    public static void main(String[] args) {
        Nqueens q = new Nqueens();
        char[][] board = new char[4][4];
        List<List<String>> allboard = new ArrayList<>();
        q.helper(board, 0, allboard);

    }
}
