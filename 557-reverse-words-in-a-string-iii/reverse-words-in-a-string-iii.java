class Solution {
    public String reverseWords(String p) {
        String []arr = p.split(" ");
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < arr.length-1; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            s.append(sb.reverse()+" ");
        }
        StringBuilder te = new StringBuilder(arr[arr.length-1]);
        te.reverse();
        s.append(te);
        return s.toString();
    }
}