class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini = (int)1e9;
        int l = 0;
        int r = 0;
        int sum = 0;
        while(r < nums.length){
            sum+=nums[r];
            while(sum >= target){
                if(sum >= target) mini = Math.min(mini , r-l+1);
                sum -= nums[l++];
            }
            r++;
        }
        if(sum >= target) mini = Math.min(mini , r-l+1);
        return mini == (int)1e9 ? 0 : mini;
    }
}