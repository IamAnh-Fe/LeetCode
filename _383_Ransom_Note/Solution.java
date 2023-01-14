package _383_Ransom_Note;

public class Solution {
  public static boolean canConstruct(String ransomNote, String magazine) {
     int[] count = new int[128];
     for (final char c : magazine.toCharArray()){
       ++count[c];
    }

    for (final char c : ransomNote.toCharArray()){
      if (--count[c] < 0){
        return false;
      }
    }
    return true;
 }
  public static void main(String[] args) {
    String ransomNote = "aa"; 
    String magazine = "aab";
    System.out.println(canConstruct(ransomNote, magazine));
  }
}
