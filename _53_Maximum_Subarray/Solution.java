package _53_Maximum_Subarray;

public class Solution {
  public static int BruteForce(int[] nums) {
    int n = nums.length;
    int cur = nums[0];
    int max = cur;
    for (int i = 0; i < n; i++) {
       cur = nums[i];
      if(cur > max){
        max = cur;
      }
      for (int j = i + 1; j < n; j++) {
     cur = cur + nums[j];
     if(cur > max ){
     max = cur;
     }
          }
        }
        return max;
  }
  //-----------------------------------------
  public static int Kadane(int[] nums) {
    int max = Integer.MIN_VALUE;
    int sum = 0;
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      sum += nums[i];
      if(sum > max){
        max = sum;
      }
      if(sum < 0){
        sum = 0;
      }
    }
    System.gc();
    return max;
  }

  public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(BruteForce(nums));
    System.out.println(Kadane(nums));
  }
}
