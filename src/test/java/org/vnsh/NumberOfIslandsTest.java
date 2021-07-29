package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {
  private final NumberOfIslands classUnderTest = new NumberOfIslands();

  @Test
  void noGrid() {
    char[][] grid1 = {{}};
    Assertions.assertEquals(0, classUnderTest.numIslands(grid1));
  }

  @Test
  void singleGrid() {
    char[][] grid1 = {{'1'}};
    Assertions.assertEquals(1, classUnderTest.numIslands(grid1));

    char[][] grid2 = {{'0'}};
    Assertions.assertEquals(0, classUnderTest.numIslands(grid2));
  }

  @Test
  void randomGrids() {
    char[][] grid1 = {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
    };
    Assertions.assertEquals(1, classUnderTest.numIslands(grid1));

    char[][] grid2 = {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '1'},
        {'0', '0', '1', '0', '1'},
        {'0', '0', '1', '0', '1'}
    };
    Assertions.assertEquals(3, classUnderTest.numIslands(grid2));
  }

  @Test
  void randomGrid1() {
    char[][] grid = {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };
    Assertions.assertEquals(3, classUnderTest.numIslands(grid));
  }

  @Test
  void randomGrid2() {
    char[][] grid = {
        {'1', '1', '1'},
        {'0', '1', '0'},
        {'1', '1', '1'}
    };
    Assertions.assertEquals(1, classUnderTest.numIslands(grid));
  }
}