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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null)return l;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> k = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.remove();
                k.add(curr.val);
                if(curr.left != null)q.add(curr.left);
                if(curr.right != null)q.add(curr.right);
            }
            // System.out.println(k);
            l.add(new ArrayList<>(k));
        }
        // for(List<Integer> k : l){
            Collections.reverse(l);
        // }
        return l;
    }
}