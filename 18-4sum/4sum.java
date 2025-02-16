class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            for(int j = i+1; j < nums.length; j++){
                if(j != i+1 && nums[j] == nums[j-1])continue;
                    int k = j+1;                
                    int l = nums.length-1;
                    while(k < l){
                        long sum = nums[i] + nums[j];
                        sum += nums[k];
                        sum += nums[l];
                        if(sum < target)k++;
                        else if(sum > target)l--;
                        else {
                            List<Integer> p = new ArrayList<>();
                            p.add(nums[i]);
                            p.add(nums[j]);
                            p.add(nums[k]);
                            p.add(nums[l]);
                            ans.add(p);
                            k++;
                            l--;
                            while(k < l && nums[k-1] == nums[k])k++;
                            while(k < l && nums[l+1] == nums[l])l--;
                        }
                    }
                
            }
        }
        // HashSet<List<Integer>> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //     HashSet<Long> st = new HashSet<>();
        //         for(int k = j+1; k < nums.length; k++){
        //             long sum = nums[i] + nums[j] ;
        //             sum += nums[k];
        //             long find = target - sum;
        //             if(st.contains(find)){
        //                 List<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);
        //                 l.add((int)find);
        //                 Collections.sort(l);
        //                 set.add(l);
        //             }
        //             st.add((long)nums[k]);
        //         }
        //         st.clear();
        //     }
        // }
        // for(List<Integer> l : set)ans.add(l);
        return ans;

    }
}