class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        for(int i = 0; i< grid.length; i++){
            Arrays.sort(grid[i]);
        }
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = grid[i].length-1; j>= 0 && limits[i] > 0 ; j--, limits[i]--){
                l.add(grid[i][j]);
            }
        // System.out.println(l);
        }
        Collections.sort(l);
        // System.out.println(l);
        long sum = 0;
        for(int i = 0; i < k; i++)sum += l.get(l.size()-1-i);
        return sum;
    }
}