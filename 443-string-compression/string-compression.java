class Solution {
    public int compress(char[] arr) {
        int pointer = 0;
        int i = 0;
        while(i < arr.length){
            char curr = arr[i];
            int c = 0;
            while(i < arr.length && arr[i] == curr){
                c++;
                i++;
            }            
            arr[pointer++] = curr;
            if(c > 1){
                String countStr = Integer.toString(c);
                for (char ch : countStr.toCharArray()) {
                    arr[pointer++] = ch;
                }
            }
        }
        return pointer;
    }
}