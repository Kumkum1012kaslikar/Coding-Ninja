package Backtracking;

public class Traversing1 {
    public static boolean ratInMaze(int maze[][]) {
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze, 0, 0, path);

    }

    public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }
        path[i][j] = 1;
        if (i == n - 1 && j == n - 1) {
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    System.out.print(path[r][c] + " ");
                }
                System.out.println();

            }
            return true;

        }
        boolean pathPossible = false;
        if (solveMaze(maze, i - 1, j, path)) {
            pathPossible = true;
        } else if (solveMaze(maze, i, j + 1, path)) {
            pathPossible = true;
        } else if (solveMaze(maze, i + 1, j, path)) {
            pathPossible = true;
        } else if (solveMaze(maze, i, j - 1, path)) {
            pathPossible = true;
        }

        return pathPossible;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
        boolean pathPossible = ratInMaze(maze);
        System.out.println(pathPossible);

    }
}
