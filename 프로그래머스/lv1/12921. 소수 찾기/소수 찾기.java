import java.lang.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++){
            int k=(int)Math.sqrt(i);
            boolean isOdd=true;
            for(int j=2;j<=k;j++){
                if (i%j==0){
                    isOdd=false; 
                    break;
                }
            }
            if (isOdd) answer++;
        }
        return answer;
    }
}