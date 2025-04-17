class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i : arr){
            if(i < 0){
                while(!st.isEmpty() && st.peek() > 0  && st.peek() < -i){
                    st.pop();
                }
                if(st.isEmpty() || st.peek() < 0)st.push(i);
                if(st.peek() == -i)st.pop();
            }
            else {
                st.push(i);
            }
        }
        int[] ans = new int[st.size()];
        for(int i = ans.length-1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}