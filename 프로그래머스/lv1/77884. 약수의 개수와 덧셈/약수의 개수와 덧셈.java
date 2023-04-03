class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            int k= (int)Math.sqrt(i);
            if(k*k==i) answer-=i;
            else answer+=i;
        }
        return answer;
    }
}