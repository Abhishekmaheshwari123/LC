class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        // if(n == 0 || n == 1)return 0;
        int []arr = new int[1+n];
        Arrays.fill(arr,1);
        for(int k = 2; k*k < arr.length; k++){
            if(arr[k] == 1){
                int i = k;
                int j = k;
                while(i*j < n){
                    arr[i*j] = 0;
                    j++;
                }
            }
        }
        HashSet<Integer> st = new HashSet<>();
        for(int i = 2; i < arr.length-1; i++)if(arr[i] == 1)st.add(i);
        for(int i = 2; i <= n/2; i++){
            if(arr[n - i]==1 && arr[i]==1){
                List<Integer> ds = new ArrayList<>();
                ds.add(i);
                ds.add(n-i);
                ans.add(new ArrayList<>(ds));
            }
        }
        return ans;
    }
}