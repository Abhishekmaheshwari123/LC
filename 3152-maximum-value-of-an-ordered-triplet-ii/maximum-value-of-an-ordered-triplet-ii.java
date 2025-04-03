class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int []front = new int[nums.length];
        front[0] = nums[0];
        for(int i = 1; i < n; i++){
            front[i] = Math.max(front[i-1] , nums[i]);
        }
        int []back = new int[nums.length];
        back[n-1] = nums[n-1];
        for(int i = n-2; i>= 0; i--){
            back[i] = Math.max(back[i+1] , nums[i]);
        }
        long maxi = 0;
        for(int i = 1; i < n-1; i++){
            maxi = Math.max(maxi , (long)((long)(front[i-1] - nums[i]) * back[i+1]));
        }
        return maxi;
    }
}