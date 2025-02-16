class Solution {
    public int distributeCandies(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }
        return Math.min(nums.length/2 , st.size());
    }
}