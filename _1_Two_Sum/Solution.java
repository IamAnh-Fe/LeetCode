package _1_Two_Sum;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
public class Solution {
  //Time complexity: O(n^2)
  public static int[] BruteForce(int[] nums, int target) { 
    for (int i = 0; i < nums.length; i++) {
      for (int j =i; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return  new int[] {};
  }
//------------------------------------
  //Time complexity: O(n)
  public static int[] HashMap(int[] nums, int target){
    Map<Integer, Integer> numToIndex = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if(numToIndex.containsKey(target - nums[i])){
        return new int[] {numToIndex.get(target-nums[i]),i};
      }
        numToIndex.put(nums[i],i);
    }
    throw new IllegalArgumentException();
  }
//-------------------------------------
  //Time complexity: O(n*log(n))
  public static int[] TwoPointer(int[] nums, int target){
    int left = 0;
    int right = nums.length - 1;
    while(left < right){
      if(nums[left] + nums[right] == target){
        return new int[] {left, right};
      }else if(nums[left] + nums[right] < target){
        left++;
      } else {
        right--;
      }
      
    }
    return new int[] {};
  }
  public static void main(String[] args) {
    int target = 9;
    int[] nums = { 2, 7, 11, 15 };
    System.out.println(Arrays.toString(BruteForce(nums, target)));
    System.out.println(Arrays.toString(HashMap(nums, target)));
    System.out.println(Arrays.toString(TwoPointer(nums, target)));
  }
}
