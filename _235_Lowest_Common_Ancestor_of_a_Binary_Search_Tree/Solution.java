package _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

public class Solution {
  public  class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root.val > Math.max(p.val, q.val)){
        return  lowestCommonAncestor(root.left, p, q);
          
      }
      if(root.val < Math.min(p.val, q.val)){
        return  lowestCommonAncestor(root.right,p,q);
          
      }
      return root;
     }
  public static void main(String[] args) {
  }
}
