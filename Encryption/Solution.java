import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        int wordLen = word.length();
        double sqrtLen = Math.sqrt(wordLen);
        int rows = (int) Math.floor(sqrtLen);
        int cols = (int) Math.ceil(sqrtLen);

        // Adjust number of rows
        rows = rows * cols >= wordLen ? rows : rows + 1;
        char[][] grid = new char[rows][cols];

        for (int i = 0; i < wordLen; i++) {
            grid[i / cols][i % cols] = word.charAt(i);
        }

        System.out.println(encode(grid, rows, cols));
    }

    private static final String encode(char[][] grid, int rows, int cols) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] == '\0') {
                    break;
                }

                sb.append(grid[i][j]);
            }

            sb.append(" ");
        }

        return sb.toString();
    }
}
