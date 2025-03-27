class Solution {
    public int minimumIndex(List<Integer> nums) {
      int c = 1;
      int ele = nums.get(0);
      for(int i = 1; i < nums.size(); i++){
        if(c == 0){
            ele = nums.get(i);
        }
        if(nums.get(i) == ele){
            c++;
        }
        else {
            c--;
        }
      }
      c = 0;
      for(int i = 0; i < nums.size(); i++){
        if(nums.get(i) == ele)c++;
      }
      int count = 0;
     int index = -1;
     for(int i = 0; i < nums.size(); i++){
        if(nums.get(i) == ele){
            count++;
            if(count > (i+1)/2){
                index = i;
                break;
            }
        }
     }
     if(c - count <= (nums.size()-index-1)/2)return -1;
     return index;

    }
}