class Solution {
	int left=10, right=12;
	public int moveCount(int bf, int af) {
        int a=1;
		if (bf%3==af%3) a=0;
        int b=(--bf/3-(--af)/3);
        if (b<0) b*=-1;
		return a+b; 
	}
    public String solution(int[] numbers, String hand) {
        String answer = "";
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]%3==1){left=numbers[i]; answer+='L';}
        	else if(numbers[i]!=0 && numbers[i]%3==0) {right=numbers[i]; answer+='R';}
        	else {
        		if(numbers[i]==0) numbers[i]=11;
        		int leftCount=moveCount(left, numbers[i]);
        		int rightCount=moveCount(right, numbers[i]);
                
        		if (leftCount==rightCount) {
        			if (hand.equals("left")) {left=numbers[i]; answer+='L';}
        			else {right=numbers[i]; answer+='R';}
        		}
        		else if (leftCount<rightCount) {left=numbers[i]; answer+='L';}
        		else {right=numbers[i]; answer+='R';}
        	}
        }
        return answer;
    }
}