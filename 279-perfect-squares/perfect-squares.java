class Solution {
    public int numSquares(int n) {
        int []arr = new int[101];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i*i;
        }
        int index = search(n,arr);
        System.out.println(index);
        if(arr[index]  == n)return 1;
        int [][]dp = new int[index+1][n+1];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return f(index , n, arr,dp);
    }   
    int f(int index , int n , int []arr,int [][]dp){
        if(n == 0)return 0;
        if(index == 1){
            return n % arr[1] == 0 ? n / arr[1] : 0;
        }
        if(dp[index][n] != -1)return dp[index][n];
        int take = (int)1e9;
        if(n - arr[index] >= 0) take = 1 + f(index , n - arr[index] , arr,dp);
        int not = 0 + f(index - 1 , n , arr,dp);
        return dp[index][n] = Math.min(take , not);
    }
    int search(int n, int []arr){
        int l = 0;
        int r = 101;
        while(l < r){
            int mid = (l+r)/2;
            if(arr[mid] == n)return mid;
            else if(arr[mid] > n)r = mid;
            else l = mid+1;
        }
        return l-1;
    }
}