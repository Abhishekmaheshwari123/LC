class Solution {
    public int countPaths(int n, int[][] roads) {
        List<List<pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < roads.length; i++){            
            adj.get(roads[i][0]).add(new pair(roads[i][1] , roads[i][2]));
            adj.get(roads[i][1]).add(new pair(roads[i][0] , roads[i][2]));
        }
        long dis[] = new long[n];
        int ways[] = new int[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        dis[0] = 0;
        ways[0] = 1; 
        PriorityQueue<pair> q = new PriorityQueue<>((a,b) -> a.time - b.time);
        q.add(new pair(0,0));
        int mod  = (int)(1e9 + 7);
        while(!q.isEmpty()){
            pair curr = q.remove();
            int prevnode = curr.node;
            long prevdis = curr.time;
            if(prevdis > dis[prevnode])continue;
            for(pair i : adj.get(prevnode)){
                long currdis = i.time;
                int currnode = i.node;
                if(prevdis + currdis == dis[currnode]){
                    ways[currnode] = (ways[prevnode] + ways[currnode])%mod;
                }
                else if(prevdis + currdis < dis[currnode]){
                    dis[currnode] = prevdis + currdis;
                    q.add(new pair(currnode,(int)dis[currnode]));
                    ways[currnode] = ways[prevnode];
                }
            }
        }
        return ways[n-1] % mod;
    }
}
class pair{
    int node ; 
    int time;
    pair(int node , int time){
        this.node = node;
        this.time = time;
    }
}