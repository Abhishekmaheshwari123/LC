class Solution {
    public int hammingDistance(int x, int y) {
        int xr = x ^ y;
        int c = 0;
        while(xr > 0){
            if(xr % 2 == 1)c++;
            xr /= 2;
        }
        return c;
    }
}