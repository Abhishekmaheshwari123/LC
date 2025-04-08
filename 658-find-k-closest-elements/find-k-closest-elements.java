class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> {
            return a.diff != b.diff ? b.diff - a.diff : b.ele - a.ele ;
        });
        for(int i : arr){
            int dif = Math.abs(x-i);
            pq.offer(new pair(dif , i));
            if(pq.size() > k)pq.remove();
        }
        List<Integer> l = new ArrayList<>();
        while(k > 0){
            l.add(pq.remove().ele);
            k--;
        }
        Collections.sort(l);
        return l;
    }
}
class pair{
    int diff;
    int ele;
    pair(int diff , int ele){
        this.diff = diff;
        this.ele = ele;
    }
}