class Solution {
    public int combinationSum4(int[] nums, int target) {        
        int []dp = new int[target + 1];
        dp[0] = 1;
        int k = target;
        target = 1;
        for(; target <= k; target++){
            int ans = 0;
            for(int i = 0; i < nums.length; i++){
                if(target - nums[i] >= 0)
                ans += dp[target - nums[i]];
            }
            dp[target] = ans;
        }
        return dp[k];
    //     Arrays.fill(dp, -1);
    //  return f(nums, target, dp);
    }
    int f(int[] nums, int target, int []dp){
        if(target == 0)return 1;
        if(target < 0)return 0;
        if(dp[target] != -1)return dp[target];
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += f(nums,target - nums[i],dp);
        }
        return dp[target] = ans;
    }
}