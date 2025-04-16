class Solution {
    public String getHint(String s, String t) {
        // System.out.println(s.length()+" "+t.length());
        HashSet<Integer> st = new HashSet<>();
        HashMap<Character,Integer> st2 = new HashMap<>();
        int c = 0;
        int tt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(i)){
                c++;
                st.add(i);
            }
            else st2.put(s.charAt(i) , st2.getOrDefault(s.charAt(i) , 0 ) + 1);
        }
        // System.out.println(st);
        // System.out.println(st2);
        for(int i = 0; i < t.length(); i++){
            if(!st.contains(i) && st2.containsKey(t.charAt(i))){
                    tt++;
                    st2.put(t.charAt(i) , st2.get(t.charAt(i)) - 1);
                    if(st2.get(t.charAt(i)) == 0){
                        st2.remove(t.charAt(i));
                    }            
            }
        }
       return c +"A" + tt+"B";
    }
}