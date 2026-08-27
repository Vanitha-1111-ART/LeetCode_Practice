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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<List<Integer>> result =new ArrayList<>();
       dfs(root,targetSum,new ArrayList<>(),result);
       return result; 
    }
    public void dfs(TreeNode root, int targetSum, List<Integer> path,List<List<Integer>> res){
        if(root==null) return;
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum ==root.val){
                res.add(new ArrayList<>(path));
            }
        }
        else{
            dfs(root.left, targetSum-root.val,path,res);
            dfs(root.right, targetSum-root.val,path,res);
        }
        path.remove(path.size()-1);
    }
}