class Solution {
    public int nthUglyNumber(int n) { 
       int []dp = new int[n];
       dp[0] = 1;
       int p1 = 0;
       int p2 = 0;
       int p3 = 0;
       for(int i = 1; i < n; i++){
        int two = dp[p1] * 2;
        int three = dp[p2] * 3;
        int five = dp[p3] * 5;
        dp[i] = Math.min(two , Math.min(three , five));
        if(dp[i]%2 == 0)p1++;
        if(dp[i]%3 == 0 )p2++;
        if(dp[i]%5 == 0)p3++;
       }
       return dp[n-1];
    }
}