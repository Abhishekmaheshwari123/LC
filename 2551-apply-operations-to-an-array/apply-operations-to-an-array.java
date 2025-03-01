class Solution {
    public int[] applyOperations(int[] nums) {
        int c = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1]=0;
            }
            if(nums[i] == 0)c++;
        }
        if(nums[nums.length-1] == 0)c++;
        c = nums.length-c;
        // return nums;
        int p = 0;
        for(int i = 0; i < nums.length ;i++){
            if(nums[i]!= 0)nums[p++] = nums[i];
        }
        for(int i = c; i < nums.length; i++)nums[i] = 0;
        
        return nums;
    }
}