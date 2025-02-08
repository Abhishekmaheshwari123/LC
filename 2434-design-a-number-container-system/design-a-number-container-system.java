class NumberContainers {
    HashMap<Integer,TreeSet<Integer>> mp ;
    HashMap<Integer,Integer> st;
    public NumberContainers() {
         mp = new HashMap<>();
         st = new HashMap<>();
    }
    
    public void change(int index, int number) {
         if(st.containsKey(index)){
            int prev = st.get(index);
            mp.get(prev).remove(index);
            if(mp.get(prev).size()==0){
                mp.remove(prev);
            }
        }
        st.put(index,number);
        if(!mp.containsKey(number)){
            mp.put(number, new TreeSet<>());
        }
        mp.get(number).add(index);
    }
    
    public int find(int number) {
        if(!mp.containsKey(number) || mp.isEmpty())return -1;
        return mp.get(number).first() ;
    }
}


/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */