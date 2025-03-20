class Solution {
    public int longestIncreasingPath(int[][] arr) {
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        int [][]vis = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[0].length; j++){
                if(vis[i][j] == 0)
                ans = Math.max(ans , dfs(i,j,arr,vis));
            }
        }
        return ans;
    }
    int dfs(int i , int j , int [][]arr , int [][]vis){
        if(vis[i][j] > 0)return vis[i][j];
        int a = 1;
        int []r = {-1,0,1,0};
        int []c = {0,1,0,-1};
        for(int p = 0; p < 4; p++){
            int newr = i + r[p];
            int newc = j + c[p];
            if(newr < 0 || newr >= arr.length || newc < 0 || newc >= arr[0].length || arr[newr][newc] <= arr[i][j])continue;
            a = Math.max(a , 1 + dfs(newr , newc , arr , vis));
        }
        return vis[i][j] = a;
    }

}