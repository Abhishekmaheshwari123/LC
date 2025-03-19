class Solution {
    public int minimumEffortPath(int[][] arr) {
        int [][]dp = new int[arr.length][arr[0].length];
        for(int i = 0 ; i < arr.length; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        PriorityQueue<pair> q = new PriorityQueue<>((a,b) -> a.dis - b.dis);
        // Queue<pair> q = new LinkedList<>();
        q.add(new pair(0,0,0));
        int []r = {-1,0,1,0};
        int []c = {0,1,0,-1};
        while(!q.isEmpty()){
            pair curr = q.remove();
            int dis = curr.dis;
            int row = curr.row;
            int col = curr.col;
            if(row == arr.length-1 && col == arr[0].length-1)return dis;
            for(int i = 0; i < 4; i++){
                int newr = row + r[i];
                int newc = col + c[i];
                if(newr >= 0 && newr < arr.length && newc >= 0 && newc < arr[0].length){
                    int diff = Math.max(dis , Math.abs(arr[row][col] - arr[newr][newc]));
                    if(diff < dp[newr][newc]){
                        dp[newr][newc] = diff;
                        q.add(new pair(diff , newr , newc));
                    }           
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
class pair{
    int dis;
    int row;
    int col;
    pair(int dis, int row , int col){
        this.dis = dis;
        this.row = row;
        this.col = col;
    }
}