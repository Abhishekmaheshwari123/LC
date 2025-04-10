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
    public int widthOfBinaryTree(TreeNode root) {
        Deque<pair> q = new ArrayDeque<>();
        q.add(new pair(root , 0));
        int maxi = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int len = 0;
            int i = q.peek().index;
            int j = q.peekLast().index;
            maxi = Math.max(maxi , j-i+1);
            for(int p = 0; p < size; p++ ){
                pair curr = q.pop();
                TreeNode a = curr.node;
                int currIndex = curr.index;
                if(a.left != null)q.add(new pair(a.left , 2*currIndex + 1));
                if(a.right != null)q.add(new pair(a.right , 2*currIndex + 2));
            }
        }
        return maxi;
    }
}

class pair{
    TreeNode node ;
    int index;
    pair(TreeNode node , int index){
        this.node = node;
        this.index = index;
    }
}