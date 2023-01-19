package _217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
          if(seen.add(num) == false){
            return true;
          }
        }
        return false;
  }
  public static void main(String[] args) {
    
  }
}
