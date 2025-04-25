class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        for(int i : nums1)l.add(i);
        for(int i : nums2)l.add(i);
        Collections.sort(l);
        if(l.size() % 2 == 0){
            return (double) (l.get(l.size()/2) + l.get(l.size()/2 - 1))/2;
        }
        return (double) l.get(l.size()/2);
    }
}