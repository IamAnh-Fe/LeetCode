package _977_Squares_of_a_Sorted_Array;

import java.util.Arrays;

public class Solution {
  public static int[] BruteForce(int[] nums) {
  for (int i = 0; i < nums.length ; i++) {
    nums[i] = nums[i] * nums[i];
    
  } 
  for (int i = 0; i < nums.length - 1; i++) {
    int min = i;
    for (int j = i + 1; j < nums.length; j++) {
      if(nums[j] < nums[min]){
        min = j;
      }
    }
    if(min != i){
      int temp = nums[i];
      nums[i] = nums[min];
      nums[min] = temp;

    }
  }
  
  return nums;
  }
  public static int[] TwoPointers(int[] nums) {
    final int n = nums.length;
    int[] ans = new int[n];
    int i = n - 1;
    for (int l = 0 , r = n - 1; r >= l;) {
      if(Math.abs(nums[l]) > Math.abs(nums[r])){
        ans[i--] = nums[l] * nums[l++];
        // System.out.println(nums[l]);
        System.out.println(nums[l++]);

      } else {
        ans[i--] = nums[r] * nums[r--];
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = {-4,-1,0,3,10};
  // System.out.println(Arrays.toString(BruteForce(nums)));
  System.out.println(Arrays.toString(TwoPointers(nums)));

  }
}
