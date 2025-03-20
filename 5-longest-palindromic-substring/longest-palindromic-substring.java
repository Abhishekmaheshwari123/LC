class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int maxi = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j <= i; j++){
                String curr = s.substring(j,1+i);
                if(check(curr)){
                    if(maxi < curr.length()){
                        maxi = curr.length();
                        ans = curr;
                    }
                    }
            }
        }
        return ans;
    }
    boolean check(String s){
        int l = 0;
        int r = s.length()-1;
        while(l <= r){
            if(s.charAt(l++) != s.charAt(r--))return false;
        }
        return true;
    }
}