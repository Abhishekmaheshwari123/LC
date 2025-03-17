class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        ArrayList<ArrayList<Integer>> mp = new ArrayList<>();
        for(int i = 0; i < 26; i++){
        mp.add(new ArrayList<>());
        }     
        for (int i = 0; i < s.length(); i++) {
            mp.get(s.charAt(i) - 'a').add(i);
        }
        int c = 0;
        HashSet<String> st = new HashSet<>();
        for(int i = 0; i < words.length; i++){
            String currString = words[i];
            if(st.contains(currString)){
                c++;
                continue;
            }
            int last = -1;
            boolean flg = false;
            for(int j = 0; j < currString.length(); j++){
                int index = upper(mp.get(currString.charAt(j) - 'a') , currString.charAt(j) ,last);
                // System.out.print(index+" ");
                if(index == -1){
                    flg = true;
                    break;
                }
                else last = index;
            }
            if(flg == false){
                st.add(currString);
                c++;
                // System.out.println(currString);
            }
        }
        return c;
    }
    int upper(ArrayList<Integer> ls , Character curr , int last){
        for(int i = 0; i < ls.size(); i++){
            if(last < ls.get(i))return ls.get(i);
        }
        return -1;
    }
}