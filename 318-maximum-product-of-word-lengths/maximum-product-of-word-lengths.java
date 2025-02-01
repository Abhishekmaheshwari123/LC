class Solution {
    public int maxProduct(String[] arr) {
        int maxi = 0;
        for(int i = 0; i < arr.length; i++){
            String s = arr[i];
            int n = s.length();
            int []c = new int[26];
            for(int k = 0; k < s.length(); k++)
                c[s.charAt(k) - 'a']++;
            for(int j = i+1; j < arr.length; j++){
                if(f(c , arr[j]))
                maxi = Math.max(maxi , n * arr[j].length() );
            }
        }
        return maxi;
    }
    boolean f(int  []arr , String s){
        for(int i = 0; i < s.length(); i++){
            if(arr[s.charAt(i) - 'a'] != 0)return false;
        }
        return true;
    }
}