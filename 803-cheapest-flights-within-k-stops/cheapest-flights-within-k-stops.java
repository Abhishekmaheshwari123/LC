class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<two>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < flights.length; i++){
            adj.get(flights[i][0]).add(new two(flights[i][1] , flights[i][2]));
        }
        Queue<three> q =  new LinkedList<>();
        int []arr = new int[n];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[src] = 0;
        q.add(new three(0,src,0));
        while(!q.isEmpty()){
            three curr = q.remove();
            if(curr.stop > k)continue;
            for(two i : adj.get(curr.node)){
                int adjNode = i.first; 
                int edW = i.second;                
                if (curr.dis + edW < arr[adjNode] && curr.stop <= k) {
                    arr[adjNode] = curr.dis + edW; 
                    q.add(new three(curr.stop + 1, adjNode, curr.dis + edW)); 
            }
        }
    }
     if (arr[dst] == Integer.MAX_VALUE)
            return -1;
        return arr[dst];
}
}
class three{
    int stop;
    int node;
    int dis;
    three(int stop,int node , int dis){
        this.stop = stop;
        this.node = node;
        this.dis = dis;
    }
}

class two{
    int first;
    int second;
    two(int first, int second){
        this.first = first;
        this.second = second;
    }
}