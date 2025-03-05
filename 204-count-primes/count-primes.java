class Solution {
    public int countPrimes(int n) {
        if(n == 0 || n == 1)return 0;
        int []arr = new int[n];
        Arrays.fill(arr,1);
        for(int k = 2; k < arr.length; k++){
            if(arr[k] == 1){
                int i = k;
                int j = 2;
                while(i*j < n){
                    arr[i*j] = 0;
                    j++;
                }
            }
        }
        // for(int i = 2; i < arr.length; i++)System.out.println(i+" "+arr[i]);
        int c = 0;
        for(int i = 2; i < arr.length; i++)if(arr[i] == 1)c++;
        return c;
    }
}