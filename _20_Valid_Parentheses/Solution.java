package _20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
  public static boolean Stack(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for (final char c : s.toCharArray())
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    return stack.isEmpty();
  }
  
  public static void main(String[] args) {
    String s =  "()[]{}";
    System.out.println(Stack(s));
  }
}
