import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int endIdx=score.length-1;
        while(true){
            if(endIdx-m<-1) break;
            endIdx-=m;
            answer+=score[endIdx+1]*m;
        }
        return answer;
    }
}