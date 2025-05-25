class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int left = 1;
        int right = 0;
        for(int i : arr){
            // left = Math.min(left , i);
            right = Math.max(right , i);
        }
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left)/2;
            int cal = f(arr,mid);
            if(cal <= threshold){
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }
    int f(int []arr, int mid){
        int sum = 0;
        for(int i : arr){
            if(i%mid == 0)sum += i / mid;
            else sum += (i / mid) + 1;
        }
        return sum;
    }
}