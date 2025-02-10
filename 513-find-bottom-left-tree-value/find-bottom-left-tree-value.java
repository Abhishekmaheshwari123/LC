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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int last = 0;
        while(!q.isEmpty()){
            for(int i = 0; i < q.size(); i++){
                TreeNode nn = q.remove();
                last = nn.val;
                if(nn.right != null)q.add(nn.right);
                if(nn.left != null)q.add(nn.left);
            }
        }
        return last;
    }
}