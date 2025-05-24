class Solution {
    public int minEatingSpeed(int[] arr, int h) {
       int maxi = 0;
       int ans = 0;
       for(int i : arr)maxi = Math.max(maxi , i);
       int left = 1;
       int right = maxi;
       while(left <= right){
        int mid = (left+right)/2;
        int cal = find(mid,arr);
        if(cal <= h){
            ans = mid;
            right = mid - 1;
        }
        else left = mid + 1;
       }
       return ans;
    }
    int find(int ele , int[]arr){
        int c = 0;
        for(int i : arr){
           c += Math.ceil((double)i / (double)ele);
        }
        return c;
    }
}