class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int zero = 0;
        for(int i : nums){
            if(i < 0)neg++;
            else if(i == 0)zero++;
        }
        return Math.max(neg , nums.length - zero - neg);

    }
}