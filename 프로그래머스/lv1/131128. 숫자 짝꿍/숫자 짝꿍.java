import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        String[] x = X.split("");
        Arrays.sort(x,Collections.reverseOrder());
        String[] y = Y.split("");
        Arrays.sort(y,Collections.reverseOrder());
        String xNum=x[0], yNum=y[0];

        int xIdx=0,yIdx=0;
        while(true){
            boolean xPop=false, yPop=false;
            if(xNum.equals(yNum)){
                answer.append(xNum);
                xPop=true;
                yPop=true;
            }
            else if(xNum.compareTo(yNum)>0){
                xPop=true;
            }
            else{
                yPop=true;
            }
            if(xPop){
                if (xIdx>=x.length-1) break;
                else xNum=x[++xIdx];
            }
            if(yPop){
                if(yIdx>=y.length-1) break;
                else yNum=y[++yIdx];
            }

        }
        if(answer.length()>0 && answer.charAt(0)=='0') return "0";
        return (answer.length()==0? "-1": new String(answer));
    }
}