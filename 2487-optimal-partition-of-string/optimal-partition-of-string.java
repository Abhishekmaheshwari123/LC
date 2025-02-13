class Solution {
    public int partitionString(String s) {
        int c = 1;
        HashSet<Character> st = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(st.contains(a)){
                c++;
                st.clear();
            }
                st.add(a);
        }
        return c;
    }
}