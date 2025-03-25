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
    public int goodNodes(TreeNode root) {
        int c = 0;
        if(root == null)return 0;
        return 1+f(root.left,root.val) + f(root.right,root.val);
    }
    int f(TreeNode node,int prev){
        if(node == null)return 0;
        if(node.val >= prev){
            return 1 + f(node.left,node.val) + f(node.right,node.val);
        }
        return f(node.left,prev) + f(node.right , prev);
    }
}