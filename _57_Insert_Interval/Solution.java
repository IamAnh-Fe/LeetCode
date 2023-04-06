package _57_Insert_Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public static int[][] insert(int[][] intervals, int[] newInterval) {
    final int n = intervals.length;
    int i = 0;
    List<int[]> ans = new ArrayList<>();
    while (i < n && intervals[i][1] < newInterval[0]) {
      ans.add(intervals[i++]);
    }
    while (i < n && intervals[i][0] <= newInterval[1]) {
      newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
      ++i;
    }
    ans.add(newInterval);
    while (i < n) {
      ans.add(intervals[i++]);
    }
    return ans.stream().toArray(int[][] ::new);

  }
  public static void main(String[] args) {
    int[][] insert = {{1,3},{6,9}};
    int[] newInterval = {2,5};
    System.out.println(Arrays.toString(insert(insert, newInterval)));
  }
}
