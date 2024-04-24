import java.util.ArrayList;

public class Nqueens {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        queen(board, 0, ans);
        return ans;
    }
    
    static boolean isSafe(char[][] board, int row, int col) {
        // vertical check 
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left up 
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    
    static void queen(char[][] board, int row, ArrayList<ArrayList<Integer>> ans) {
        // base case
        if (row == board.length) {
            ans.add(generate(board));
            return;
        }
        // rowwise add
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                // next recursion
                queen(board, row + 1, ans);
                // now backtrack
                board[row][j] = '.';
            }
        }
    }
    
    static ArrayList<Integer> generate(char[][] board) {
        ArrayList<Integer> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                solution.add(board[i][j] == 'Q' ? 1 : 0);
            }
        }
        return solution;
    }
    public static void main(String[] args) {
        int n = 4; // Change the value of n as needed
        ArrayList<ArrayList<Integer>> solutions = solveNQueens(n);

        System.out.println("Solutions for " + n + "-Queens problem:");
        for (ArrayList<Integer> solution : solutions) {
            for (int i = 0; i < solution.size(); i++) {
                System.out.print(solution.get(i) + " ");
                if ((i + 1) % n == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
