package _21_Merge_Two_Sorted_Lists;

public class Solution {
   public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
          return list1 == null ? list2 : list1;
        }
        if(list1.val > list2.val){
          printList(list1);
          ListNode temp  =  list1;
          list1 = list2;
          list2 = temp;
        }
        // 1 2 4
        // 1 3 4
        // 1 1 2
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
  }
   public static void printList(ListNode head){
      while(head != null){
        System.out.print(head.val + " ");
        head = head.next;
      }
      System.out.println();
    }
  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(4);
    n1.next = n2; n2.next = n3;
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(3);
    ListNode l3 = new ListNode(4);
    l1.next = l2; l2.next = l3;
    // printList(n1);
    // printList(l1);

    ListNode newList = mergeTwoLists(n1, l1);
    printList(newList);
  }
}
