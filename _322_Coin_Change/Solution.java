package _322_Coin_Change;

import java.util.Arrays;

public class Solution {
  public static int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1]; 
    Arrays.fill(dp, 1, dp.length, amount + 1);
    for (final int coin : coins){
      for (int i = coin; i <= amount; ++i){
        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        System.out.println(Arrays.toString(dp));
        // System.out.println(coin);
      }

    }

    return dp[amount] == amount + 1 ? -1 : dp[amount];

  }
  public static void main(String[] args) {
    int[] coin = {1, 2, 5};
    int amount = 11;
    System.out.println(coinChange(coin, amount));
  }
}
