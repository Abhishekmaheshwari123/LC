class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int left = 0;
        int right = arr[0].length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int col_num = find(arr,mid);
            int low = mid-1 >= 0 ? arr[col_num][mid-1] : -1;
            int high = mid + 1 < arr[0].length ? arr[col_num][mid+1] : -1;
            if(arr[col_num][mid] > low && arr[col_num][mid] > high)return new int[]{col_num , mid};
            else if(arr[col_num][mid] < low) right = mid - 1;
            else left = mid + 1;
        }
        return new int[]{-1,-1};
    }
    int find(int [][]arr, int mid){
        int index = -1;
        int maxi = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i][mid] > maxi){
                index = i;
                maxi = arr[i][mid];
            }
        }
        return index;
    }
}