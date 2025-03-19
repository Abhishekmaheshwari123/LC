class Solution {
    public int minOperations(int[] nums) {
        int c = 0;
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] == 0){
                nums[i] = 1 - nums[i];
                nums[i+1] = 1 - nums[i+1];
                nums[i+2] = 1 - nums[i+2];
                c++;
            }
        }
        for(int i : nums)if(i == 0)return -1;
        return c;
    }
}