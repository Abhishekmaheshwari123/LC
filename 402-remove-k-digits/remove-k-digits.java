class Solution {
    public String removeKdigits(String num, int k) {
        // System.out.println(num.length());
        if(k == num.length())return "0";
       Stack<Character> st = new Stack<>();
       for(int i = 0; i < num.length(); i++){
            while(!st.isEmpty() &&  k > 0 && ((st.peek()-'0') > (num.charAt(i)-'0'))){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
       }
       while(k > 0){
            st.pop();
            k--;
        }
        // System.out.println(st);
       StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()){
        sb.append(st.pop());
       }
       sb = sb.reverse();
       String ans = sb.toString();
       int i = 0;
       while(i < ans.length()-1 && ans.charAt(i) == '0')i++;
       ans = ans.substring(i);
       return ans;
    }
}