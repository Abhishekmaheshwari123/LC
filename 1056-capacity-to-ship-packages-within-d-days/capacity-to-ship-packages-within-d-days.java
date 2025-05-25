class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int left = 0;
        int right = 0;
        for(int i : arr){
            left = Math.max(left , i);
            right += i;
        }
        int sum = right;
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(possible(arr,mid,days)){
                ans = mid;
                right = mid - 1;
                System.out.println(ans);
            }
            else 
                left = mid + 1;
        }
        return ans;
    }
    boolean possible(int []arr ,int total , int days){        
        int sum = 0;
        for(int i : arr){
            sum += i;
            if(sum == total){
                days--;
                sum = 0;
            }
            else if(sum > total){
                sum = i;
                days--;
            }
            if(days < 0)return false;
        }
        if(sum > 0)days--;
        return days >= 0;

    }
}