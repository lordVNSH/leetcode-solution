package org.vnsh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 207. Course Schedule
 * <p>
 * Medium
 * <p>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * <p>
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 * <p>
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 * <p>
 * Example 2:
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * <p>
 * Constraints:<br>
 * 1 <= numCourses <= 10^5<br>
 * 0 <= prerequisites.length <= 5000<br>
 * prerequisites[i].length == 2<br>
 * 0 <= ai, bi < numCourses<br>
 * All the pairs prerequisites[i] are unique.
 */
public class CourseSchedule {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> courseGraph = new HashMap<>();
    for (int[] prerequisite : prerequisites) {
      if (!courseGraph.containsKey(prerequisite[1])) {
        courseGraph.put(prerequisite[1], new ArrayList<>());
      }
      courseGraph.get(prerequisite[1]).add(prerequisite[0]);
    }
    return !isCyclicGraph(courseGraph);
  }

  private boolean isCyclicGraph(Map<Integer, List<Integer>> courseGraph) {
    Set<Integer> visitedCourse = new HashSet<>();
    Set<Integer> recSet = new HashSet<>();
    for (Map.Entry<Integer, List<Integer>> entry : courseGraph.entrySet()) {
      if (!visitedCourse.contains(entry.getKey())) {
        if (checkDfsCyclic(courseGraph, entry.getKey(), visitedCourse, recSet)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean checkDfsCyclic(Map<Integer, List<Integer>> courseGraph, Integer key, Set<Integer> visitedCourse,
                                 Set<Integer> recSet) {
    if (visitedCourse.contains(key)) {
      return false;
    }
    if (recSet.contains(key)) {
      return true;
    }
    recSet.add(key);
    for (Integer child : courseGraph.getOrDefault(key, Collections.emptyList())) {
      if (checkDfsCyclic(courseGraph, child, visitedCourse, recSet)) {
        return true;
      }
    }
    visitedCourse.add(key);
    recSet.remove(key);
    return false;
  }
}
