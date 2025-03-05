class Solution {
    public int maxDepth(String s) {
        int maxi = 0;
        int c = 0;
        // Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')c++;
            else if(s.charAt(i) == ')'){
                maxi = Math.max(maxi,c);
                c--;
            }
        }
        return maxi;
    }
}