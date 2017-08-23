import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] grid = new int[in.nextInt()][in.nextInt()];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        grid[i][j] = in.nextInt();
      }
    }
    System.out.println(getMaxRegionSize(grid));
  }
  
  private static int getMaxRegionSize(int[][] grid) {
    int maxRegionSize = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        int curRegionSize = explore(grid, i, j);
        if (curRegionSize > maxRegionSize) {
          maxRegionSize = curRegionSize;
        }
      }
    }
    return maxRegionSize;
  }
  
  private static int explore(int[][] grid, int i, int j) {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
      return 0;
    }
    if (grid[i][j] == 0) {
      return 0;
    }
    int total = 1;
    grid[i][j] = 0;
    total += explore(grid, i - 1, j - 1);
    total += explore(grid, i - 1, j);
    total += explore(grid, i - 1, j + 1);
    total += explore(grid, i, j - 1);
    total += explore(grid, i, j + 1);
    total += explore(grid, i + 1, j - 1);
    total += explore(grid, i + 1, j);
    total += explore(grid, i + 1, j + 1);
    return total;
  }
}
