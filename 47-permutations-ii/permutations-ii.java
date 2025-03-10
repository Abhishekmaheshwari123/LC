class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
    boolean []freq=new boolean[nums.length];
    per(nums,0,l,ds,freq);
return l;
    }
    static void per(int []nums,int index,List<List<Integer>> l, List<Integer> ds,boolean []freq){
        if(ds.size()==nums.length){
            if(!l.contains(ds))
            l.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                per(nums,index+1,l,ds,freq);
                freq[i]=false;
                ds.remove(ds.size()-1);
                
            }
        }
    }
}