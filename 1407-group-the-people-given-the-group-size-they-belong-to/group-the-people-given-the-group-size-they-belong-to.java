class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i] , new ArrayList<>());
                List<Integer> l = mp.get(arr[i]);
                l.add(i);
                mp.put(arr[i] , l);
            }
            else mp.get(arr[i]).add(i);
        }
        for(int index : mp.keySet()){
            List<Integer> l = mp.get(index);
            int size=l.size()/index;
            for(int i = 1; i <= size; i++){
                List<Integer> temp = new ArrayList<>();
                for(int c = 0; c < index; c++){
                    int k = l.get(0);
                    temp.add(k);
                    l.remove(0);
                }
                ans.add(temp);

            }
        }
        return ans;
    }
}