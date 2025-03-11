class Solution {
    public int numberOfSubstrings(String s) {
        int c = 0;
        int r = 0;
        int l = 0;
        int a = 0;
        int b = 0;
        int cnt = 0;
        int n = s.length();
        while(r < n){
            char curr = s.charAt(r);
            if(curr == 'a')a++;
            else if(curr == 'b')b++;
            else if(curr == 'c')c++;
            while(a > 0 && b > 0 && c > 0){
                cnt += (n-r);
                char last = s.charAt(l);
                if(last == 'a')a--;
                else if(last == 'b')b--;
                else if(last == 'c')c--;
                l++;
            }
            r++;
        }
        return cnt;
    }
}