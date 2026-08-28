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
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root ==null) return 0;
        if(root.val < low){
          return  rangeSumBST(root.right,low,high);
        }
        if(root.val > high){
            return rangeSumBST(root.left,low,high);
        }
     return root.val + rangeSumBST(root.right,low,high) +rangeSumBST(root.left,low,high);
    }
    void dfs(TreeNode root, int high){
        if(root ==null) return;
        dfs(root.left ,high);
        if(root.val>high) {
            return ;
        } 
        if(root.val<=high) {
            System.out.println(root.val);
            sum+=root.val;
        } 
        dfs(root.right,high);
    }
}