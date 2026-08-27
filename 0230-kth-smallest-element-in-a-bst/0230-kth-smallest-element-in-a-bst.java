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
    List<Integer> res= new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        int x=k;
        dfs(root);
        System.out.print(res);
        return res.get(x-1);
    }
    void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left );
        res.add(root.val);
        dfs(root.right);
    }
}