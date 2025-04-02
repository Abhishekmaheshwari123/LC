class Solution {
    public int maxScore(int[] nums, int k) {
        int maxi = 0;
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        System.out.println(sum);
        maxi = Math.max(maxi , sum);
        int p = 0;
        for(int i = k-1; i >= 0; i--){
            sum += nums[n-1-p++];
            sum -= nums[i];
            System.out.println(sum);
            maxi = Math.max(maxi , sum);
        }
        // sum -= nums[0];
        // sum += nums[n-k];
        // System.out.println(sum);
        // maxi = Math.max(maxi , sum);
        return maxi;
    }
}