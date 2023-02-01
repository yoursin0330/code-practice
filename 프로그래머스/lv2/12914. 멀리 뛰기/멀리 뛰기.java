class Solution {//피보나치와 유사
    public long solution(int n) {
        long[] arr= new long[n+1];
        arr[1]=1; 
        if(n>=2) arr[2]=2;
        for(int i=3;i<n+1;i++) arr[i]=arr[i-1]%1234567+arr[i-2]%1234567;
        return arr[n]%1234567;
    }
}