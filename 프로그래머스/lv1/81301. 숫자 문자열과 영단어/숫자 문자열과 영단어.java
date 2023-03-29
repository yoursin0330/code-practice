class Solution {
    public int solution(String s) {
        String[] numEng = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        for(int i=0;i<numEng.length;i++){
            s=s.replace(numEng[i],String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}