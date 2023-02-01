class Solution {
    public int[] solution(int brown, int yellow) {
    	//가로>=세로 길이 고정!!!
        int[] answer = new int[2]; //가로, 세로
        
        int s=brown+ yellow;//전체 넓이,  a*b
        int k=(int)Math.floor(Math.sqrt(s));
        //a=(brown+4)/2-b
        int a=s,b;
        while(a>=k) {
        	if (s%a!=0) {
        		a--; continue;}
            b=s/a;
        	if(brown==(a+b)*2-4) {
        		answer[0]=a; answer[1]=b;
                break;
        	}
        	else a--;
        }
        return answer;
    }
}