package org.vnsh;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CourseScheduleTest {
  private final CourseSchedule classUnderTest = new CourseSchedule();

  @Test
  void simpleNoLoop() {
    int[][] courseEdges = {{0, 1}};
    assertTrue(classUnderTest.canFinish(2, courseEdges));
  }

  @Test
  void simpleLoop() {
    int[][] courseEdges = {{0, 1}, {1, 0}};
    assertFalse(classUnderTest.canFinish(2, courseEdges));
  }

  @Test
  void selfLoop() {
    int[][] courseEdges = {{0, 0}};
    assertFalse(classUnderTest.canFinish(2, courseEdges));
  }

  @Test
  void complexLoop() {
    int[][] courseEdges = {{2, 1}, {3, 1}, {4, 1}, {5, 4}, {6, 4}, {7, 5}, {1, 7}};
    assertFalse(classUnderTest.canFinish(7, courseEdges));
  }

  @Test
  void complexNoLoop() {
    int[][] courseEdges = {{2, 1}, {3, 1}, {4, 1}, {5, 4}, {6, 4}, {7, 5}, {7, 1}};
    assertTrue(classUnderTest.canFinish(7, courseEdges));
  }
}