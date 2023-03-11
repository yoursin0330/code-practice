class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start=0;
        for(int x: section){
            if(start>x) continue;
            else{
                start=x+m;
                answer++;
            }
        }
        return answer;
    }
}