class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int r = 0;
        int l = 0;
        int maxi = 0;
        while(r < arr.length){
            mp.put(arr[r] , mp.getOrDefault(arr[r] , 0) + 1);
            while(mp.size() > 2){
                mp.put(arr[l] , mp.get(arr[l]) - 1);
                if(mp.get(arr[l]) == 0)mp.remove(arr[l]);
                l++;
            }
            maxi = Math.max(maxi , r-l+1);
            r++;
        }
        return maxi;
    }
}

class pair{
    int v;
    int count;
    pair(int v , int count){
        this.v = v;
        this.count = count;
    }
}