class Solution {
    public int candy(int[] arr) {
        int []pre = new int[arr.length];
        int []front = new int[arr.length];
        pre[0] = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= arr[i-1])pre[i] = 1;
            else pre[i] = 1 + pre[i-1];
        }
        front[arr.length-1] = 1;
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] <= arr[i+1])front[i] = 1;
            else front[i] = front[i+1] +1;
        }
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans += Math.max(front[i] , pre[i]);
        }
        return ans;
    }
}