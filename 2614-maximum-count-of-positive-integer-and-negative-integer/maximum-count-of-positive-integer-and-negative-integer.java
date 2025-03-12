class Solution {
    public int maximumCount(int[] nums) {
      int n = nums.length;
      int last = n - 1;
      int c_neg = find(0,last, -1 , nums);
      int posi_positive = find(c_neg,last, 0, nums);
      int c_pos = (n - posi_positive);
      return Math.max(c_neg , c_pos);
    }
    int find(int start , int end , int target , int  []nums){
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] <= target)start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
}