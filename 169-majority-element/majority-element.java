class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0;
        int count = 1;
        for(int i : nums){
            if(ele == i){
                count++;
            }
            else {
                count--;
                if(count == 0){
                    ele = i;
                    count = 1;
                }
            }
        }
        return ele;
    }
}