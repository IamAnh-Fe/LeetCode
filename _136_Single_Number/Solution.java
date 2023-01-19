package _136_Single_Number;

public class Solution {
  public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
          ans ^= num; 
        }
        return ans;
  }
  public static void main(String[] args) {
    int[] nums = {2,2,1};
    System.out.println(singleNumber(nums));
  }
}
