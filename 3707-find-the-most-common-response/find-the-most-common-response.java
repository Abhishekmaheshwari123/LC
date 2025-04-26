class Solution {
    public String findCommonResponse(List<List<String>> l) {
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i = 0; i < l.size(); i++){
            HashSet<String> st = new HashSet<>();
            for(int j = 0; j < l.get(i).size(); j++){
                st.add(l.get(i).get(j));
            }
            for(String s : st){
                mp.put(s , mp.getOrDefault(s , 0) + 1);
            }
        }
        String ans = "";
        int maxFreq = 0;
        for (String s : mp.keySet()) {
            int freq = mp.get(s);
            if (freq > maxFreq || (freq == maxFreq && s.compareTo(ans) < 0)) {
                ans = s;
                maxFreq = freq;
            }
        }
        return ans;
        // return "";
    }
}