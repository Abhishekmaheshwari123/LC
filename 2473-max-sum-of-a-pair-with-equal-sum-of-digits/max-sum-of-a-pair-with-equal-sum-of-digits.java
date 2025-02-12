class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int maxi = -1;
        // System.out.println(convert(89));
        for(int i = 0; i < nums.length; i++){
            int ele = convert(nums[i]);
            if(mp.containsKey(ele)){
                if(maxi <  nums[i] + mp.get(ele))maxi =  nums[i] + mp.get(ele);
                mp.put(ele , Math.max(mp.get(ele) , nums[i]));
            }
                else mp.put(ele , nums[i]);
        }
        return  maxi;
    }
    int convert(int n){
        int sum = 0;
        while(n != 0){
            sum += n %10;
            n/=10;
        }
        return sum;
    }
}