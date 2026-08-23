package in.tree;

public class SearchInABinarySearchTree700 {
      public class TreeNode {
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val) return root;
        TreeNode newNode = new TreeNode();
        if(root.val<val) newNode = searchBST(root.right, val);
        else newNode = searchBST(root.left, val);
        return newNode;
    }
}
