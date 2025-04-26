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
        // System.out.println(mp);
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> {
           return  mp.get(b) == mp.get(a) ? a.compareTo(b) :  mp.get(b) - mp.get(a) ;
            });
        for(String s: mp.keySet()){
            pq.offer(s);
        }
        return pq.peek();

        // return "";
    }
}