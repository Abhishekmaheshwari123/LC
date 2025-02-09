class Solution {
    public long countBadPairs(int[] nums) {
        long c = 0;
        int n = nums.length;
        long total =(long) n*(n-1)/2;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int find = nums[i] - i;
            if(mp.containsKey(find))c += (long)mp.get(find);
            mp.put(find , mp.getOrDefault(find , 0)+1);
        }
        return total - c;
    }
}