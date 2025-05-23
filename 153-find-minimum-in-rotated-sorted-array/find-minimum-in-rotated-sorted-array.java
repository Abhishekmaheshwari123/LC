class Solution {
    public int findMin(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(nums[left] <= nums[right])return Math.min(nums[left],mini);
            if(nums[left] <= nums[mid]){         // if left half is sorted
                mini = Math.min(mini , nums[left]);
                left = mid + 1;
            }
            else {                               // right half is sorted
                mini = Math.min(mini , nums[mid]);
                right = mid - 1;
            }
        }
        return mini;
    }
}