import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = in.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        List<Pair> pairs = new ArrayList<Pair>();
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                char cur = grid[i][j];
                if (grid[i - 1][j] < cur
                    && grid[i + 1][j] < cur
                    && grid[i][j - 1] < cur
                    && grid[i][j + 1] < cur) {
                    pairs.add(new Pair(i, j));
                }
            }
        }

        for (int i = 0; i < pairs.size(); i++) {
            Pair p = pairs.get(i);
            grid[p.row][p.col] = 'X';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
            }

            System.out.println();
        }
    }
}

class Pair {
    int row;
    int col;

    public Pair(int r, int c) {
        this.row = r;
        this.col = c;
    }
}
