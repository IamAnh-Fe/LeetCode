package _104_Maximum_Depth_of_Binary_Tree;

public class Solution {
  public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
    public static int maxDepth(TreeNode root) {
        if(root == null){
          return 0;
        }
        int LDepth = maxDepth(root.left);
        int RDepth = maxDepth(root.right);
      return 1 + Math.max(LDepth, RDepth);
    }
  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    System.out.println(maxDepth(root));

  }
}
