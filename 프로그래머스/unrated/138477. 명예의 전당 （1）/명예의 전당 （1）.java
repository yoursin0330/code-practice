import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] scoreList = new int[score.length];
        for(int i=0;i<score.length;i++){
            scoreList[0]=score[i];
            Arrays.sort(scoreList);
            if(i<k) answer[i]=scoreList[score.length-i-1];
            else answer[i] = scoreList[score.length-k];
        }
        return answer;
    }
}