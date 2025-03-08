class Solution {
    public int minimumRecolors(String s, int k) {
      int mini = Integer.MAX_VALUE;
      for(int i = 0; i <= s.length()-k;i++){
        String t = s.substring(i,i+k);
        mini = Math.min(mini,find(t,s));
      }
      return mini;
    }
    int find(String t , String s){
        int c = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == 'W')c++;
        }
        return c;
    }
}