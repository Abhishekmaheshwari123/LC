class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ls = 0;
        int c = 0;
        for(int i : nums){
            if(i < pivot)ls++;
            if(i == pivot)c++;
        }
        int []arr = new int[nums.length];
        for(int i = 0; i < c; i++) arr[ls++] = pivot;
        int st = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == pivot)continue;
            if(nums[i] < pivot)arr[st++] = nums[i];
            else if(nums[i] > pivot) arr[ls++] = nums[i];
            
        }
        return arr;
    }
}