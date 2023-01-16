package _169_Majority_Element;

public class Solution {
  public static int majorityElement(int[] nums) {
        int ans = 0;
        int count = 0;
        for (final int num : nums) {
          if(count == 0){
            ans = num;
          }
          count += num == ans ? 1 : -1;
           System.out.print(count);
        }
        return ans;
  }
  public static void main(String[] args) {
    int[] nums = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(nums));

  }
}
