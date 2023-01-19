package _232_Implement_Queue_using_Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
  Deque<Integer> input = new ArrayDeque<>();
  Deque<Integer> output = new ArrayDeque<>();
  public void push(int x) {
      input.push(x);
  }
  
  public int pop() {
    if(output.isEmpty()){
      while(!input.isEmpty()){
        output.push(input.pop());
      }
    }    return output.pop();
  }
  
  public int peek() {
    if(output.isEmpty()){
      while(!input.isEmpty()){
        output.push(input.pop());
      }
    }
      return output.peek();
  }
  
  public boolean empty() {
    return  input.isEmpty() && output.isEmpty();
  }
  public static void main(String[] args) {
    
  }
}
