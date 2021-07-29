package org.vnsh;

/**
 * 200. Number of Islands
 * <p>
 * Medium
 * <p>
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example 1:
 * Input: grid = [<p>
 * ["1","1","1","1","0"],<p>
 * ["1","1","0","1","0"],<p>
 * ["1","1","0","0","0"],<p>
 * ["0","0","0","0","0"]<p>
 * ]<p>
 * Output: 1
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: grid = [<p>
 * ["1","1","0","0","0"],<p>
 * ["1","1","0","0","0"],<p>
 * ["0","0","1","0","0"],<p>
 * ["0","0","0","1","1"]<p>
 * ]<p>
 * Output: 3
 * <p><p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'.
 */
public class NumberOfIslands {
  public int numIslands(char[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int islandCount = 0;
    int[][] visited = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (visited[i][j] == 0 && grid[i][j] == '1') {
          islandCount++;
          visited[i][j] = 1;
          markNeighbours(grid, visited, i, j);
        }
      }
    }
    return islandCount;
  }

  private void markNeighbours(char[][] grid, int[][] visited, int i, int j) {
    int i1 = i - 1;
    int j1 = j;
    if (i1 >= 0 && visited[i1][j1] != 1 && grid[i1][j1] == '1') {
      visited[i1][j1] = 1;
      markNeighbours(grid, visited, i1, j1);
    }
    i1 = i + 1;
    if (i1 < grid.length && visited[i1][j1] != 1 && grid[i1][j1] == '1') {
      visited[i1][j1] = 1;
      markNeighbours(grid, visited, i1, j1);
    }
    i1 = i;
    j1 = j - 1;
    if (j1 >= 0 && visited[i1][j1] != 1 && grid[i1][j1] == '1') {
      visited[i1][j1] = 1;
      markNeighbours(grid, visited, i1, j1);
    }
    j1 = j + 1;
    if (j1 < grid[i1].length && visited[i1][j1] != 1 && grid[i1][j1] == '1') {
      visited[i1][j1] = 1;
      markNeighbours(grid, visited, i1, j1);
    }
  }
}
