package _217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
          if(!set.add(num)){
            return true;
          }
        }
        return false;
  }
  public static void main(String[] args) {
    int[] nums = {1,1,1,3,3,4,3,2,4,2};
    System.out.println(containsDuplicate(nums));
  }
}
