package _226_Invert_Binary_Tree;

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
    static TreeNode root;
  public TreeNode invertTree(TreeNode root) {
        if(root == null){
          return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
  }
  public static void main(String[] args) {
    Solution tree = new Solution();
    root = new TreeNode(1);
    root.left = new TreeNode(2); 
		root.right = new TreeNode(3); 
    System.out.println(tree.invertTree(null));
  }
}
