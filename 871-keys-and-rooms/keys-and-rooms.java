class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int []vis = new int[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = 1;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int i : rooms.get(curr)){
                if(vis[i] == 1)continue;
                q.add(i);
                vis[i] = 1;
            }
        }
        for(int i : vis)if(i == 0)return false;
        return true;
    }
}