package _704_Binary_Search;

public class Solution {
  public static int search(int[] nums, int target) {
    int l = nums[0];
    int r = nums.length - 1;
    while(l <= r){
      int m = l + (r - l) / 2;
      if(nums[m] == target){
        return m;
      } else if(nums[m] < target){
        l = l+ 1;
      } else {
        r = r - 1;
      }

    }
         
         return -1;
  }
  public static void main(String[] args) {
    int[] nums = {-1,0,3,5,9,12};
    int target  = 9;
    System.out.println(search(nums, target));
  }
}
