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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            mp.put(inorder[i] , i);
        }
        return f(0,inorder.length-1,inorder , 0, postorder.length-1,postorder , mp);
    }
    TreeNode f(int i, int il , int []inorder , int j , int jl , int []postorder , HashMap<Integer,Integer> mp){
        if(i > il || j > jl)return null;
        TreeNode node = new TreeNode(postorder[jl]);
        int index = mp.get(postorder[jl]);
        node.left = f(i,index-1,inorder,j,j+index-i-1,postorder , mp);
        node.right = f(index+1,il,inorder,j+index-i,jl-1,postorder,mp);;
        return node;
    }
}