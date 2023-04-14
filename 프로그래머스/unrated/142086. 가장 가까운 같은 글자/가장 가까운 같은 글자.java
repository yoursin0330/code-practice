import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(charMap.containsKey(ch)){
                answer[i]=i-charMap.get(ch);
            }else{
                answer[i]=-1;
            }
            charMap.put(ch,i);
        }
        return answer;
    }
}