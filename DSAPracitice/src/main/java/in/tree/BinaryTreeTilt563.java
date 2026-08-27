package in.tree;

public class BinaryTreeTilt563 {
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
    int totalTilt = 0;
    public int findTilt(TreeNode root) {
        findSum(root);
        return totalTilt;
    }
    public int findSum(TreeNode root){
        if(root==null) return 0;
        int left = findSum(root.left);
        int right = findSum(root.right);
        totalTilt+=Math.abs(left-right);
        return root.val + left+right;
    }
}
