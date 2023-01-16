package _141_Linked_List_Cycle;

public class Solution {
  class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow == fast){
            return true;
          }
        }
        return false;
    }
  public static void main(String[] args) {
    
  }
}
