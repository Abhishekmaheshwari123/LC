class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i : nums){
            if(i < k)pq.offer((long) i);
        }
        int c = 0;
        while(pq.size() >= 2){
            long first = pq.remove();
            long second = pq.remove();
            long put = (Math.min(first , second)*2)+ Math.max(first , second);
            // System.out.println(put);
            if(put < k)pq.offer( put);
            c++;
        }
    // System.out.println(pq.size());
        return c+pq.size();
    }
}