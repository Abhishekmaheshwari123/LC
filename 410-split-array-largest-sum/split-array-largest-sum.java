class Solution {
    public int splitArray(int[] arr, int k) {
        int left = 0;
        int right = 0;
        for(int i : arr){
            right += i;
            left = Math.max(left , i);
        }
        // System.out.println(right);
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(possible(mid,arr,k)){
                ans = mid;
                // System.out.println(mid);
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;

    }
    boolean possible(int mid , int []arr, int k){
        int temp = mid;
        for(int i : arr){
            if(temp - i >= 0){
                temp -= i;
            }
            else {
                k--;
                temp = mid;
                temp -= i;
            }
        }
        if(temp < mid)k--;
        return k >= 0;
    }
}