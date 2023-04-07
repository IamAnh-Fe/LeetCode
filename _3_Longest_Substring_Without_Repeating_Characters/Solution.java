package _3_Longest_Substring_Without_Repeating_Characters;

import java.util.Arrays;

public class Solution {
  public static int lengthOfLongestSubstring(String s) {
        int ans  = 0;
        int[] cout = new int[128];
        for (int l = 0, r = 0; r < s.length(); ++r) {
          ++cout[s.charAt(r)];
          System.out.println(Arrays.toString(cout));
          while (cout[s.charAt(r)] > 1) {
            --cout[s.charAt(l++)];
          }
          ans = Math.max(ans, r - l + 1);
        }
        return ans;
  }
  public static void main(String[] args) {
    String s  = "abcabcbb";
    System.out.println(lengthOfLongestSubstring(s));
  
  }
}
