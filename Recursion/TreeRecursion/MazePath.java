package Recursion.TreeRecursion;

public class MazePath {
    static void findPaths(int mat[][], int i, int j, String path) {
        int n = mat.length;
        
        // Base case: if current position is the destination
        if (i == n - 1 && j == n - 1) {
            System.out.println(path);
            return;
        }
        
        // Check if current position is within the maze and not blocked
        if (i < 0 || j < 0 || i >= n || j >= n ) {
            return;
        }
           
        // Explore horizontal and vertical paths recursively
        findPaths(mat, i + 1, j, path + "H"); // Move horizontally
        findPaths(mat, i, j + 1, path + "V"); // Move vertically
        
        // Backtrack: Mark current cell as unvisited
        mat[i][j] = 1;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {0, 0, 0,0},
            {0, 0, 0,0},
            {0, 0, 0,0},
            {0,0,0,0}
        }; 
        findPaths(maze, 0, 0, ""); // Start from the top-left corner
    }
}
