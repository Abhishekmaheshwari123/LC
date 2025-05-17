class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int prev = i-1; 
            int forward = i+1;
            int c = 1;
            while(prev >= 0 && forward < s.length() && s.charAt(prev) == s.charAt(forward)){
                prev--;
                forward++;
                c++;                
            }
            ans += c;
            c = 0;
            prev = i-1;
            forward = i;
            while(prev >= 0 && forward < s.length() && s.charAt(prev) == s.charAt(forward)){
                prev--;
                forward++;
                c++;                
            }
            ans += c;

        }
        return ans;
    }
}