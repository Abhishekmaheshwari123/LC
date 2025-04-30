class Solution {
    public long maxScore(int[] a, int[] b) {
        long [][]dp = new long[a.length][b.length];
        for(long []i : dp)Arrays.fill(i,-1);
        return f(0,0,a,b,dp);
    }
    long f(int j , int i, int []a , int []b, long [][]dp){
        if(j == 4)return 0;
        if(i >= b.length)return (long)-1e17;
        if(dp[j][i] != -1)return dp[j][i];
        long x = (long) a[j] * b[i] + f(j+1,i+1,a,b,dp);
        long y = f(j,i+1,a,b,dp);
        return dp[j][i] = Math.max(x , y);
    }
}