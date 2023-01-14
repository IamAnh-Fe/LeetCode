package _70_Climbing_Stairs;

public class Solution {
  public static int climbStairs(int n) {
      int[] dp = new int[n + 1];
      dp[0] = 1;
      dp[1] = 1;
      for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2]; 
      }
      return dp[n];
  }
  public static void main(String[] args) {
    int n = 1;
    System.out.println(climbStairs(n));
  }
}
