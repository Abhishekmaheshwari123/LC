class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int mini = Integer.MAX_VALUE;
        int ans = -1;
        List<List<pair>> adj = new ArrayList<>();
        for(int i = 0; i <n; i++)adj.add(new ArrayList<>());
        for(int []i : edges){
            int u = i[0];
            int v = i[1];
            int dis = i[2];
            adj.get(u).add(new pair(v , dis));
            adj.get(v).add(new pair(u , dis));
        } 
        for(int i = 0; i < n; i++){
            int find = solve(i,distanceThreshold,adj,n);
            if(find <= mini){
                ans = i;
                mini = find;
            }
        }
        return ans;
    }
    int solve(int node, int threshold,List<List<pair>> adj , int n){
        int c = 0;
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> b.dis - a.dis);
        int []vis = new int[n];
        // vis[node] = 1;
        pq.add(new pair(node , threshold));
        while(!pq.isEmpty()){
                pair curr = pq.remove();
                int vertex = curr.tar;
                int cost = curr.dis;
                if(vis[vertex] == 1)continue;
                vis[vertex] = 1;
                c++;
                for(pair k : adj.get(vertex)){
                    if(cost - k.dis >= 0 && vis[k.tar] == 0){
                        pq.offer(new pair(k.tar, cost - k.dis));
                    }
                }
        }
        return c;
    }
}

class pair{
    int tar;
    int dis;
    pair(int tar, int dis){
        this.tar = tar;
        this.dis = dis;
    }
}