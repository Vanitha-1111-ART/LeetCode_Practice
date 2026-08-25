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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        Post(root,arr);
        return arr;
    }
    public void Post(TreeNode root,List<Integer> list){
        if(root==null) return;
        Post(root.left,list);
        Post(root.right,list);
        list.add(root.val);
    }
}