class Solution {
    public boolean checkPowersOfThree(int n) {
        List<Integer> l = new ArrayList<>();
        int ele = 1;
        for(;ele <= n;){
            l.add(ele);
            ele *= 3;
        }
        return f(0,n,l);
    //     if(n %3 != 0)n--;
    //    while(n > 0){
    //     if(n%3 != 0)break;
    //     while(n%3 == 0) n/= 3;
    //     n--;
    //    }
    //    return n == 0;
    }
    boolean f(int index , int n , List<Integer>l){
        if(n == 0)return true;
        if(index == l.size())return false;
        boolean take = false ; 
        if(n-l.get(index) >= 0) take = f(index+1 , n - l.get(index) , l);
        boolean not = f(index+1 , n , l);
        return take || not;

    }
}