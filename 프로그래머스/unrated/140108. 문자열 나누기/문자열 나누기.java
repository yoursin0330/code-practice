class Solution {
    public int solution(String s) {
        int answer = 0;
        int startIdx=0;
        char[] charArr = s.toCharArray();
        int sameCount=0;
        int diffCount=0;
        for(int i=startIdx;i<charArr.length;i++){
            if(charArr[i]==charArr[startIdx]) sameCount++;
            else diffCount++;
            if(sameCount==diffCount){
                startIdx=i+1;
                answer++;
                sameCount=0;
                diffCount=0;
            }
        }
        if(startIdx<charArr.length) answer++;
        return answer;
    }
}