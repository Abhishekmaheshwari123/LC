class Solution {
    public String decodeString(String s) {
       Stack<String> st = new Stack<>();
       int num = 0;
       Stack<Integer> stt = new Stack<>();
       for(int i = 0; i < s.length(); i++){
        char curr = s.charAt(i);
        if(curr == ']'){
            StringBuilder get = getstring(st);
            st.pop();
            int n = stt.pop();
            StringBuilder ans = new StringBuilder();
            for(int k = 0; k < n; k++){
                ans.append(get);
            }
            st.push(ans.toString());
        }
        else if(Character.isDigit(curr)){
            num = num * 10 + (curr - '0');
        }
        else if(curr == '[') {
            stt.push(num);
            num = 0;
            st.push(curr+"");
        }
        else st.push(curr+"");
       }
       StringBuilder a = new StringBuilder();
       while(!st.isEmpty()){
        a.insert(0,st.pop());
       }
       return a.toString();
    }
    StringBuilder getstring(Stack<String> st){
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty() && !st.peek().equals("[")){
            sb.insert(0,st.pop());
        }
        return sb;
    }
}