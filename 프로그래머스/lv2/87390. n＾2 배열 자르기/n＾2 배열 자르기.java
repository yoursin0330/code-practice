class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        int t,j;
        for(int k=0;k+left<=right;k++) {
        	t=(int)((k+left)/(long)n);
            j=(int)((k+left)%(long)n);
        	if (t<j) t=j;
        	answer[k]=t+1; 
        }
        return answer;
    }
}