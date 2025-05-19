class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
         f(9,n,k,l,ds);
         return l;
    }
    void f(int index , int n , int k , List<List<Integer>> l ,List<Integer> ds ){
        if(n == 0 && k == 0){
            l.add(new ArrayList<>(ds));
            return ;
        }
        if(k < 0 || n < 0|| index <= 0)return ;
        // if(n == 0)



        if(n - index >= 0){
            ds.add(index);
            f(index-1,n-index,k-1,l,ds);
            ds.remove(ds.size()-1);
        }
        f(index-1,n,k,l,ds);
    }
}