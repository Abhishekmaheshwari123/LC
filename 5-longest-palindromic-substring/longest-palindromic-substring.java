class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)return s;
        String ans = "";
        for(int i = 1; i < s.length(); i++){
            int l = i;
            int r = i;
            while(s.charAt(l) == s.charAt(r)){
                String temp = s.substring(l,r+1);
                if(temp.length() > ans.length()){
                    ans = temp;
                }
                l--;
                r++;
                if(l == -1 || r == s.length())break;
            }
            l = i-1;
            r = i;
            while(s.charAt(l) == s.charAt(r)){
                String temp = s.substring(l,r+1);
                if(temp.length() > ans.length()){
                    ans = temp;
                }
                l--;
                r++;
                if(l == -1 || r == s.length())break;
            }
        }
        return ans;
    }
}