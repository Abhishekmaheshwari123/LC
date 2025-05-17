class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum = 0;
        long find = 0;
        for(int []i : grid){
            for(int j : i)sum += j;
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                find += grid[i][j];
            }
            if(sum - find == find)return true;
        }
        find = 0;
        for(int i = 0; i < grid[0].length; i++){
            for(int j = 0; j < grid.length; j++){
                find += grid[j][i];
            }
            if(sum - find == find)return true;
        }
        return false;

    }
}