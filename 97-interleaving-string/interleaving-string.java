class Solution {
    public boolean isInterleave(String s, String t, String main) {
        int [][]dp = new int[s.length()+1][t.length()+1];
        for(int []i : dp){
            Arrays.fill(i , -1);
        }
        return f(0,s,0,t,main,dp);
    }
    boolean f(int i , String s , int j ,String t , String main, int [][]dp){
        if(i+j == main.length())return i == s.length() && j == t.length();
        if(i == s.length() && j == t.length())return false; 
        if(dp[i][j] != -1)return dp[i][j] == 1;
        boolean ans = false;              
        if(i < s.length() && s.charAt(i) == main.charAt(i+j)){
            ans =  f(i+1,s,j,t,main,dp);
        }
        if(j < t.length() && t.charAt(j) == main.charAt(i+j)){
            ans = ans ||  f(i,s,j+1,t,main,dp);
        }
        dp[i][j] =  ans == true ? 1 : 0;
        return ans;
    }
}