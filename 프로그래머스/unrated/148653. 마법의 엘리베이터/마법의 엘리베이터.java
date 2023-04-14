class Solution {
    public int solution(long storey) {
        long storeyTwo=storey;
        int answerOne = 0;
        int answerTwo=0;
        while(storey>0){
            int x=(int)(storey%10);
            storey/=10;
            if(x<=5) answerOne+=x;
            else{
                answerOne+=10-x;
                storey++;
            }
        }
        while(storeyTwo>0){
            int x=(int)(storeyTwo%10);
            storeyTwo/=10;
            if(x<5) answerTwo+=x;
            else{
                answerTwo+=10-x;
                storeyTwo++;
            }
        }
        return Math.min(answerOne,answerTwo);
    }
}