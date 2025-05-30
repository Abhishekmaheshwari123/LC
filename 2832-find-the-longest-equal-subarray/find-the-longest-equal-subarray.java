class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int maxi = 0;
        int left = 0;
        int right = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(right < nums.size()){
            int curr = nums.get(right);
            mp.put(curr, mp.getOrDefault(curr , 0) + 1 );
            maxi = Math.max(maxi , mp.get(curr));
            int window_size = right - left + 1;
            if(window_size - maxi > k){
                mp.put(nums.get(left) , mp.get(nums.get(left)) - 1);
                left++;

            }
            right++;
        }
        return maxi;
    }
}