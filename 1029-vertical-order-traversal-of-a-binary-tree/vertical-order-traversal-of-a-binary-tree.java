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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> mp = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root , 0 , 0));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                pair curr = q.remove();
                TreeNode nn = curr.node;
                int level = curr.level;
                int vertical = curr.vertical;
                if(!mp.containsKey(vertical)){
                    mp.put(vertical,new TreeMap<>());
                }
                if(!mp.get(vertical).containsKey(level)){
                    mp.get(vertical).put(level,new PriorityQueue<>());
                }
                mp.get(vertical).get(level).offer(nn.val);
                if(nn.left != null)q.add(new pair(nn.left,level+1,vertical - 1));
                if(nn.right != null)q.add(new pair(nn.right,level+1,vertical + 1));
            }            
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> pq : mp.values()){
            List<Integer> l = new ArrayList<>();
            for(PriorityQueue<Integer> elements_in_pq : pq.values()){
                while(!elements_in_pq.isEmpty()){
                    l.add(elements_in_pq.remove());
                }
            }
            ans.add(new ArrayList<>(l));
        }

        return ans;
    }
}
class pair{
    TreeNode node ; 
    int level;
    int vertical;
    pair(TreeNode node , int level , int vertical){
        this.node = node;
        this.level = level;
        this.vertical = vertical;
    }
}