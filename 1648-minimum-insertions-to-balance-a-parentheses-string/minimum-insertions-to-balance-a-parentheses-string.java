class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')st.push(s.charAt(i));
            else {
               if(!st.isEmpty()){
                    if(i+1 < s.length() && s.charAt(i+1) == ')'){
                        st.pop();
                        i++;
                    }
                    else {
                        ans++;
                        st.pop();
                    }
               }
               else {
                    if(i+1 < s.length() && s.charAt(i+1) == ')'){
                        ans++;
                        i++;
                    }
                    else {
                        ans+=2;
                    }
                }
            }
        }
        return ans + 2*st.size();
    }
}