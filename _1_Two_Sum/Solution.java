package _1_Two_Sum;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
public class Solution {
  //Time complexity: O(n^2)
  public static int[] BruteForce(int[] nums, int target) { 
    for (int i = 1; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        System.out.println("i:" + i);
        System.out.println("j:" + j);

        if (nums[j - i] + nums[j] == target) {
          return new int[] { j - i, j };
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

  public static void main(String[] args) {
    int target = 9;
    int[] nums = { 11, 15,2, 7};
    System.out.println(Arrays.toString(BruteForce(nums, target)));
    System.out.println(Arrays.toString(HashMap(nums, target)));
  }
}
