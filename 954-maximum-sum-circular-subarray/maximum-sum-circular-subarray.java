class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum1 = kadane(nums);
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
            nums[i] = -nums[i];
        }
        int sum2 =total + kadane(nums);
        if(sum2 == 0)return sum1; // when all elements are of same parity +ive or -ive
        return Math.max(sum1,sum2);
    }
    int kadane(int []arr){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i : arr){
            sum += i;
            maxi = Math.max(maxi , sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
        // return Math.max(maxi , sum);
    }
}