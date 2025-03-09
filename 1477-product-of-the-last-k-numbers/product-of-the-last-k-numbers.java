class ProductOfNumbers {
    List<Integer> st;
    public ProductOfNumbers() {
        st = new ArrayList<>();

    }
    
    public void add(int num) {
        if(num == 0){
            st.clear();
            return ;
        }
        int last = (st.size() == 0) ? 1 : st.get(st.size() - 1);
        st.add(last * num);
    }
    
    public int getProduct(int k) {
        int size = st.size();
        if(size == k)return st.get(k-1);
        else if(size < k)return 0;
        else {
            return st.get(size-1) / st.get(size - k -1);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */