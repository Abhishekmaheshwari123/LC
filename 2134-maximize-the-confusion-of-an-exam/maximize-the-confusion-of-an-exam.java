class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxConsecutiveTrues = findmaxConsecutive(answerKey , k , 'T');
        int maxConsecutiveFalse = findmaxConsecutive(answerKey , k , 'F');
        // System.out.println(maxConsecutiveTrues+" "+maxConsecutiveFalse);
        return Math.max(maxConsecutiveTrues, maxConsecutiveFalse);
    }
    public int findmaxConsecutive(String answerKey , int k, char presentCharacter){
        int leftpointer = 0;
        int rightpointer = 0;
        int count = 0;
        int maxi = 0;
        while(rightpointer < answerKey.length()){
            if(answerKey.charAt(rightpointer) == presentCharacter){
                count++;
            }
            else {
                if(k >= 0){
                    count++;
                    k--;
                }
                while(leftpointer < answerKey.length() && k < 0){
                    if(answerKey.charAt(leftpointer) != presentCharacter){
                        k++;
                    }
                    leftpointer++;
                }                
            }
            maxi = Math.max(maxi , rightpointer - leftpointer + 1);
            rightpointer++;
        }
        return maxi;
    }
}