import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2]; //탈락자 번호, round
        Set<String> wordList = new HashSet<>();
        String lastWord="";    
        int k;
        for(k=0;k<words.length;k++) {
        	String temp=words[k];
        	if(wordList.contains(temp)) { answer[0]=k%n+1; answer[1]=k/n+1;break;}
        	else if(lastWord.equals("")|| lastWord.endsWith((temp.split("")[0]))) {//맨첫글자 == 맨뒷글자
        		wordList.add(temp);
        		lastWord=temp;
        	}
        	else {answer[0]=k%n+1; answer[1]=k/n+1;break;} //제대로 된 끝말잇기X
        }
        return answer;
    }
}