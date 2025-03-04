class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n %3 != 0)n--;
       while(n > 0){
        if(n%3 != 0)break;
        while(n%3 == 0) n/= 3;
        n--;
       }
       return n == 0;
    }
}