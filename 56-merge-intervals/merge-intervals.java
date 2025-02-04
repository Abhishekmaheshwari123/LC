class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr , (a,b) -> {
           return  a[0] == b[0] ? a[1]-b[1] : a[0] - b[0];
        });
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(arr[0][0]);
        l.add(arr[0][1]);
        ll.add(new ArrayList<>(l));
        for(int i = 1; i < arr.length; i++){
            if(ll.get(ll.size()-1).get(1) >= arr[i][0]){
                ll.get(ll.size() - 1).set(1 , Math.max(ll.get(ll.size()-1).get(1) , arr[i][1]));
            }
            else{
                ArrayList<Integer> p = new ArrayList<>();
                p.add(arr[i][0]);
                p.add(arr[i][1]);
                ll.add(new ArrayList<>(p));
            }
        }
        int [][]ans = new int[ll.size()][2];
        for(int i = 0; i < ll.size(); i++){
            ans[i][0] = ll.get(i).get(0);
            ans[i][1] = ll.get(i).get(1);
        }
        return ans;
    }
}