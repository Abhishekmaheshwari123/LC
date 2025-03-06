class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []arr = new int[grid.length*grid.length+1];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j< grid.length; j++){
                arr[grid[i][j]]++;
            }
        }
        int []ans = new int[2];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)ans[1] = i;
            if(arr[i] == 2)ans[0] = i;
        }
        return ans;
    }
}