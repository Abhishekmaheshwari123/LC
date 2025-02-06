class Solution {
    public int tupleSameProduct(int[] nums) {
    int c = 0;
       HashMap<Integer,Integer> mp = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
        for(int j = i+1; j < nums.length; j++){
            int pro = nums[i] * nums[j];
            if(mp.containsKey(pro)){
                c+=mp.get(pro);
                // c++;
            }
                mp.put(pro , mp.getOrDefault(pro , 0) +1);
        }
       }
    //    System.out.println(mp);
       return c*8;
    }
}