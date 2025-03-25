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
    public int countNodes(TreeNode root) {
        int lh = leftheight(root);
        int rh = rightheight(root);
        if(lh == rh)return (int)Math.pow(2,lh) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    int leftheight(TreeNode node){
        int c = 0;
        while(node != null){
            c++;
            node = node.left;
        }
        return c;
    }
    int rightheight(TreeNode node){
        int c = 0;
        while(node != null){
            c++;
            node = node.right;
        }
        return c;
    }
}