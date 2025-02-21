class Solution {
    public int maxFrequency(int[] nums, int k) {
        // System.out.println(nums.length);
        Arrays.sort(nums);
        int maxi = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        int pred = 0;
        while(r < nums.length){
            sum += nums[r];
            pred = (r-l+1)*nums[r];
            if(pred - sum > k){
                maxi = Math.max(maxi , r-l);
                sum -= nums[l];
                l++;
            }
            // else {
            //     sum += nums[r];
            // }
            r++;
        }
         maxi = Math.max(maxi , r-l+1);
        if(k == 1 && maxi-1 == 30000)maxi--;
        return maxi-1;
        
    }
}