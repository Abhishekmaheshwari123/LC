class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        long count =0;
        Arrays.sort(nums);
        for(int i =0;i<n;i++){
            int low=lowerbound(i+1,n-1,nums,lower-nums[i]);
            int high=upperbound(i+1,n-1,nums,upper-nums[i]);
            count+=(high-low);
        }
        return count;
    }
        int lowerbound(int start,int end,int[] nums, int target){
            while(start<=end){
                int mid = start+(end-start)/2;
                if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            } 
            return start;
        }
        int upperbound(int start,int end,int[] nums, int target){
            while(start<=end){
                int mid = start+(end-start)/2;
                if(nums[mid]<=target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            } 
            return start;
        } 
}