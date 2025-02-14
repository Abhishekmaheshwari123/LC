class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        if(rowIndex == 0)return l;
            long prev = 1;
        for(int col = 1; col < rowIndex; col++){
            long curr = prev * (rowIndex-col+1)/col;
            // curr /= (col);
            l.add((int)curr);
            prev = curr;
        }
        l.add(1);
        return l;
    }
}