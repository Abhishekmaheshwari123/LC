class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
     return f(nums,k) - f(nums,k-1);
    }
    int f(int []nums , int k){
        int i = 0;
        int j = 0;
        int c = 0;
        int ans = 0;
        while(i < nums.length){
            if(nums[i] % 2 == 1){
                c++;
            }
            while(j < nums.length && c > k){
                if(nums[j]%2 == 1){
                    c--;
                }
                j++;
            }
            ans += i-j+1;
            i++;
        }
        return ans;
    }
}