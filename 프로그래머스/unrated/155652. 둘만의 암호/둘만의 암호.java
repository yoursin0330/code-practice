import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        Map<Character, Boolean> charMap = new HashMap<>();
        for(char ch: skip.toCharArray()) charMap.put(ch, true);
        for(char ch: s.toCharArray()){
            int i=0;
            while(i<index){
                ch=(++ch)>'z'?'a':ch;
                if(!charMap.containsKey(ch)) i++;
            }
            answer.append(ch);
        }
        return new String(answer);
    }
}