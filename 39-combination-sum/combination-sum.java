class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        f(0,arr,target,l,ds);
        return l;
    }
    void f(int index, int []arr, int target ,List<List<Integer>> l, List<Integer> ds){
        if(index == arr.length-1){
            if(target%arr[index] == 0){
                int size = target / arr[index];
                for(int i = 0; i < size; i++)
                ds.add(arr[index]);            
                l.add(new ArrayList<>(ds));
                for(int i = 0; i < size; i++)
                ds.remove(ds.size()-1);            
            }
            return ;
        }
        if(target == 0){
            l.add(new ArrayList<>(ds));
            return ;
        }
        if(target < 0)return ;
        if(target - arr[index] >= 0){
            ds.add(arr[index]);
            f(index,arr,target - arr[index],l,ds);
            ds.remove(ds.size()-1);
        }
        f(index+1,arr,target,l,ds);
    }
}