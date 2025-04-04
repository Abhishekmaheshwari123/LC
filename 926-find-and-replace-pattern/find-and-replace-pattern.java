class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(check(pattern , words[i]) && check(words[i] , pattern))l.add(words[i]);
        }
        return l;
    }
    boolean check(String pattern , String s){
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(mp.containsKey(pattern.charAt(i))){
                if(mp.get(pattern.charAt(i)) != s.charAt(i))return false;
            }
            mp.put(pattern.charAt(i) , s.charAt(i));
        }
        return true;
    }
}