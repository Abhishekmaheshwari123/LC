class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int i : nums){
            if(st.contains(i))st.remove(i);
            else st.add(i);
        }
        int []ans = new int[2];
        int c = 0;
        for(int i :st){
            ans[c++] = i;
        }
        return ans;
    }
}