package _20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
  //Brute Force
  public  static  boolean Stack1(String s){
    Deque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
        stack.push(s.charAt(i));
      } else  if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
        stack.pop();
      } else  if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
        stack.pop();
      } else  if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
        stack.pop();
      } else {
        return false;
      }
    }
    return stack.isEmpty();
  }
  public static boolean Stack2(String s) {
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

  public  static boolean Stack3(String s){
    int i = -1;
    char[] ch = new char[s.length()];
    for(char c : s.toCharArray()){
      if(c =='(' || c =='{' || c =='['){
        ch[++i] = c;
      } else  if (ch[i] == '(' && c==')' || ch[i] == '{' && c =='}' || ch[i] == '[' && c == ']'){
        i--;
      } else{
        return  false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    String s =  "()[]{}";
    System.out.println(Stack2(s));
    System.out.println(Stack1(s));
    System.out.println(Stack3(s));

  }
}
