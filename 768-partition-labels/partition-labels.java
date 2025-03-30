class Solution {
    public List<Integer> partitionLabels(String s) {
        int []arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] = i+1;
        }      
        List<Integer> ans = new ArrayList<>();
        int mainlast = -1;
        for(int i = 0; i < s.length(); ){
            int last = arr[s.charAt(i) - 'a'];
            if(last > mainlast){
                mainlast = last;
                for(int l = i; l < mainlast; l++){
                    int ls = arr[s.charAt(l) - 'a'];
                    if(ls > mainlast){
                        mainlast = ls;
                    }
                }
            }
            i = mainlast;
            ans.add(mainlast);
        }
        for(int i = ans.size()-1; i >= 1; i--){
            ans.set(i,ans.get(i) - ans.get(i-1));
        }
        return ans;
    }
}