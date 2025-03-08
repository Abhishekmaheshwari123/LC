class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums,goal) - f(nums, goal-1);
    }
    int f(int []nums , int goal){
        if(goal < 0)return 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        int c = 0;
        while(r < nums.length){
            sum += nums[r];            
            while(l < nums.length && sum > goal){
                sum -= nums[l++];
            }
            c+=r-l+1;
            r++;
        }
        return c;
}
}