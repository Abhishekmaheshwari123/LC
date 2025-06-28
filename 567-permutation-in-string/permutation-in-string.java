class Solution {
    public boolean checkInclusion(String s, String t) {
        if(s.length() > t.length())return false;
        int []arr = new int[26];
        int []nums = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            nums[t.charAt(i) - 'a']++;
        }
        if(equals(arr,nums))return true;
        for(int i = s.length(); i < t.length(); i++){
            nums[t.charAt(i) - 'a']++;
            nums[t.charAt(i-s.length()) - 'a']--;
            if(equals(arr,nums))return true;
        }
        return false;
    }
    boolean equals(int []arr , int []nums){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != nums[i])return false;
        }
        return true;
    }
}