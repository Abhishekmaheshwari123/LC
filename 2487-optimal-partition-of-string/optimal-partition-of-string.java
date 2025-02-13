class Solution {
    public int partitionString(String s) {
        int c = 1;
        int []arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(arr[a - 'a'] != 0){
                c++;
                Arrays.fill(arr,0);
            }
                arr[a - 'a']++;
        }
        return c;
    }
}