class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int small=0, big=0;
        for(int i=0;i<sizes.length;i++) {
        	small=Math.max(Math.min(sizes[i][0],sizes[i][1]),small);
        	big=Math.max(Math.max(sizes[i][0],sizes[i][1]),big);
        }
        answer=small*big;
        return answer;
    }
}