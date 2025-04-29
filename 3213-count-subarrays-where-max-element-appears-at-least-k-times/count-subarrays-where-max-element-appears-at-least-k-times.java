class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = 0;
        // int mod = (int)(1e9+7);
        for(int i : nums)maxi = Math.max(maxi , i);
        int l = 0;
        int r = 0;
        int c = 0;
        long ans = 0;
        while(r < nums.length){
            if(nums[r] == maxi)c++; 
            while(c >= k) {
                    if(nums[l] == maxi)c--;
                    l++;
            }
            ans += l;
            r++;
        }
        return ans ;
    }
}