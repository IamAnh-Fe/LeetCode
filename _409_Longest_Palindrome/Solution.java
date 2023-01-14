package _409_Longest_Palindrome;

public class Solution {
  public static int longestPalindrome(String s) {
    int ans = 0;
        int[] count = new int[128];
        for (final char c : s.toCharArray()) {
          ++count[c];
        }
        for (final int c : count) {

          ans += c / 2 * 2;
          // if(ans % 2 == 0 && c % 2 == 1){
          //   ans++; 
          // }
          System.out.print(c );
        }
        return ans;
      }
      public static void main(String[] args) {
        String s = "abccccdd";
    System.out.println(longestPalindrome(s));
  }
}
