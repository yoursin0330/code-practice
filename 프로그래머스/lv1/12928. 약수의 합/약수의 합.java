class Solution {
    public int solution(int n) {
        int answer = 0;
        int i;
        for(i=1;i<Math.sqrt(n);i++){
            if (n%i==0){
                answer+=i+n/i;
            }
        }
        if (i*i==n) answer+=i; 
        return answer;
    }
}