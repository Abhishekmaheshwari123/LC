class Solution {
    public int minDays(int[] arr, int m, int k) {
        int n = arr.length;
        long mul = m*k;
        if(mul > n)return -1;
        int left = Integer.MAX_VALUE;
        int right = 0;
        for(int i : arr){
            left = Math.min(left , i);
            right = Math.max(right , i);
        }
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(possible(m,k,mid,arr)){
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
        
    }
    boolean possible(int m, int k, int mid , int []arr){
        int c = 0;
        int count = 0;
        for(int i : arr){
            if(mid >= i){
                c++;
            }
            else {
                c = 0;
            }
            if(c == k){
                count++;
                c = 0;
            }
        }
        return count >= m;
    }
}