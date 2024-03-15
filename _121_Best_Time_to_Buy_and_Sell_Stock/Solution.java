package _121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
  public static int maxProfit1(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
          if(buy > prices[i]){
            buy = prices[i];
          } else if(prices[i] - buy > maxProfit){
            maxProfit = prices[i] - buy;
          }
        }
        return maxProfit;
  }
  public static int maxProfit2(int[] prices) {
    if(prices == null || prices.length <= 1)
    {
        return 0;
    }
    int minbuy = prices[0];
    int profit = 0;
    for(int i =0; i<prices.length;i++)
    {
        minbuy = Math.min(minbuy,prices[i]);
        profit = Math.max(profit,prices[i]-minbuy);
    }
    return profit;
  }
  public static void main(String[] args) {
    int prices[] = { 7, 1, 5, 6, 4 };
    System.out.println(maxProfit1(prices));
    System.out.println(maxProfit2(prices));

  }
}
