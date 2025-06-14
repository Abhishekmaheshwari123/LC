class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        boolean a =  check(nums,k,1) ;
        boolean b = check(nums,k,-1);        
        return a || b;
    }
    boolean check(int []arr, int k, int tar){
        int []nums = arr.clone();
        int last = -1;
        for(int i = 0; i < nums.length-1 && k > 0; i++){
            if(nums[i] != tar) {
                nums[i] = -nums[i];
                nums[i+1] = -nums[i+1];
                k--;
                last = i;
            }
        }
        for(int i = last+1; i < nums.length; i++){
            if(nums[i] != tar)return false;
        }
        return true;
    }
}