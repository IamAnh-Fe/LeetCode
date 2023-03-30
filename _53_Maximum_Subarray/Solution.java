package _53_Maximum_Subarray;

public class Solution {
  public static int maxSubArray(int[] nums) {
    
    int cur = nums[0];
    int max = cur;
    for (int i = 0; i < nums.length; i++) {
       cur = nums[i];
      if(cur > max){
        max = cur;
      }
      for (int j = i + 1; j < nums.length; j++) {
     cur = cur + nums[j];
     if(cur > max ){
     max = cur;
     }
          }
        }
        return max;
  }
  public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));
  }
}
