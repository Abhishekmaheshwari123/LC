class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            for(int j = i+1; j < n; j++){
                if(j != i+1 && nums[j] == nums[j-1])continue;
                int k = j+1;
                int l = n-1;
                long sum = 0;
                while(k < l){
                    sum = nums[i] + nums[j] ;
                    sum += nums[k]; 
                    sum += nums[l];
                    if(sum > target){
                        l--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else {
                        List<Integer> ll = new ArrayList<>();
                        ll.add(nums[i]);
                        ll.add(nums[j]);
                        ll.add(nums[k]);
                        ll.add(nums[l]);
                        ans.add(new ArrayList<>(ll));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1])k++;
                        while(k < l && nums[l] == nums[l+1])l--;
                    }
                }
            }
        }
        return ans;
    }
}