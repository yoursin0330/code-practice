class Solution {
    public boolean solution(int x) {
        int numbers=0, temp=x;
        while(temp>0){
            numbers+=temp%10;
            temp/=10;
        }
        return (x%numbers==0)?true: false;
    }
}