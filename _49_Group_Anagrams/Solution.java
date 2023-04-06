package _49_Group_Anagrams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Solution {
  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> keyToAnagrams = new HashMap<>();

    for (final String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = String.valueOf(chars);
      System.out.println(keyToAnagrams);
      keyToAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(keyToAnagrams.values());
  }
    public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(groupAnagrams(strs));
  }
}
