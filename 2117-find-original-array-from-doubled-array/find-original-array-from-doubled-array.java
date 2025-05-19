class Solution {
    public int[] findOriginalArray(int[] arr) {
        int n = arr.length;
        List<Integer> l = new ArrayList<>();
        int []temp = new int[n/2];
        if(n % 2 != 0)return new int[]{};
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int i : arr){
            st.put(i,st.getOrDefault(i , 0) + 1);
        }
        int c = 0;
        Arrays.sort(arr);
        for(int i : arr){
            if(st.get(i) <= 0)continue;
            else if(st.getOrDefault(i*2,0) <= 0){
                return new int[]{};
            }
            temp[c++] = i;
            st.put(i,st.get(i) - 1);
            st.put(i*2 , st.get(i*2) - 1);
        }        
        return temp;
    }
}