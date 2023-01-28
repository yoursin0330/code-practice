class Solution {
    public long solution(long n) {
        long k=(long)Math.sqrt(n);
        if (n==k*k) return (k+1)*(k+1);
        else return -1;
    }
}