class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int index = s.indexOf(part);
            s = s.substring(0,index) + s.substring(index+part.length());
        }
        return s;
//         Stack<Character> st = new Stack<>();
//         for(int i = 0; i < s.length(); i++){
//             if(st.size() >= part.length() && check(st,part)){
//                 for(int j = 0; j < part.length(); j++)st.pop();
//             }
//             else st.push(s.charAt(i));
//         }
//         StringBuilder sb = new StringBuilder();
//         while(!st.isEmpty())sb.append(st.pop());
//         return sb.reverse().toString();
//     }
//    boolean check(Stack<Character> st , String s){
//         String temp = "";
//         boolean flg = true;
//         for(int i = 0; i < s.length(); i++){
//             temp += st.peek();
//             if(s.charAt(s.length()-1-i) != st.pop()){
//                 flg = false;
//                 break;
//             }
//         }
//         for(int i = 0; i < temp.length(); i++)st.push(temp.charAt(i));
//         return flg;
    }
}