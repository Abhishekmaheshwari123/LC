class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
            HashSet<Long> st = new HashSet<>();
                for(int k = j+1; k < nums.length; k++){
                    long sum = nums[i] + nums[j] ;
                    sum += nums[k];
                    long find = target - sum;
                    if(st.contains(find)){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        l.add((int)find);
                        Collections.sort(l);
                        set.add(l);
                    }
                    st.add((long)nums[k]);
                }
                st.clear();
            }
        }
        for(List<Integer> l : set)ans.add(l);
        return ans;
    }
}