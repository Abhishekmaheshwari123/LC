class Solution {
    public int maxScore(int[] nums, int k) {
        int maxi = 0;
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        if(n == k)return sum;
        maxi = sum;
        int p = n-1;
        for(int i = k-1; i >= 0; i--){
            sum -= nums[i];
            sum += nums[p--];
            maxi = Math.max(maxi , sum);
        }  
        return maxi;
    }
}