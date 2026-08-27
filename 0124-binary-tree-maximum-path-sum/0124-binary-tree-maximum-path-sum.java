/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxHeight=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxHeight;
    }
    public int dfs(TreeNode root){
     if(root == null) return 0;
        int l=Math.max(0,dfs(root.left));
        int r=Math.max(0,dfs(root.right));

        int c=root.val + l+r;
        maxHeight =Math.max(maxHeight ,c);
        return root.val+Math.max(l,r);
    }
}