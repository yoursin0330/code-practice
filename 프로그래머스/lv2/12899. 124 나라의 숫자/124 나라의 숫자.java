class Solution {
    public String solution(int n) {
        String answer = "";
        while(n>0) {//3진수
        	int x=--n%3;
        	switch(x) {
                case 0: answer+='1';break;
                case 1: answer+='2';break;
                case 2: answer+='4';break;
            }
        	n/=3;
        }
        return new StringBuffer(answer).reverse().toString();
    }
}