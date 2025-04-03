class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return f(nums,k) - f(nums,k-1);
       
    }
    int f(int []nums , int k){
        int []arr = new int[nums.length+1];
        int r = 0;
        int l = 0;
        int c = 0;
        int ans = 0;
         while(r < nums.length){
            if(arr[nums[r]] == 0)c++;
            arr[nums[r]]++;
            while(c > k){
                arr[nums[l]]--;
                if(arr[nums[l]] == 0)c--;
                l++;
            }
            if(c  <= k) {
                ans += r-l+1;
            }
            r++;
        }
        return ans;
    }
}