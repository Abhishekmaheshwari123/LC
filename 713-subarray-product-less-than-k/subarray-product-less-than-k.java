class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int c = 0;
      long pro = 1;
      int l = 0;
      int r = 0;
      while(r < nums.length){
        pro *= nums[r];
        boolean flg = true;
        while(pro >= k && r > l){
            pro /= nums[l++];
        }
        if(pro < k)
        c += r-l+1;
        r++;
      }
      return c;
    }

}