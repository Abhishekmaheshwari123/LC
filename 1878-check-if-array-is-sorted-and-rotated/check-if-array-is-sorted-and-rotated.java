class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[i+1])c++;
            if(c>= 2)return false;
        }
        if(nums[0] < nums[n-1])c++;
        if(c >= 2)return false;
        return true;
    }
}