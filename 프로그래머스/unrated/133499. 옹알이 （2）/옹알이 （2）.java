class Solution {
public int solution(String[] babbling) {
    int answer = 0; 
    String[] words = {"aya", "ye", "woo", "ma"};
    for(int i=0;i<babbling.length;i++){
        int ansNum=-1;
        int tempNum=-1;
        boolean cycle=true;
        boolean repitition = false;
        while(babbling[i].length()>0) {
            cycle = true; //일치하는 게 없이 한 사이클 다 돌았는지 체크
            for (int idx = 0; idx < 4; idx++) {
                if (babbling[i].startsWith(words[idx])) {
                    cycle = false;
                    babbling[i] = babbling[i].replaceFirst(words[idx], "");
                    tempNum = idx;
                    break;
                }
            }
            if (cycle) break;

            if(ansNum>=0 && ansNum==tempNum){
                repitition=true;
                break;
            }
            else{
                ansNum=tempNum;
            }
        }
        if (!cycle&&!repitition && babbling[i].length()==0) answer++;
    }
    return answer;
}
}