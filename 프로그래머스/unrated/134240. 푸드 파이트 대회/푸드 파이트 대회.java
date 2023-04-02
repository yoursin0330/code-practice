class Solution {
    public String solution(int[] food) {
        String left="";
        String right="";
        for(int i=1;i<food.length;i++){
            if (food[i]/2>0){
                int times=food[i]/2;
                for(int j=0;j<times;j++){
                    left+=i;
                    right=i+right;
                }
            }
        }
        return left+"0"+right;
    }
}