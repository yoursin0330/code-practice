import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character,Integer> keysMap = new HashMap<>();
        for(int keyIdx=0;keyIdx<keymap.length;keyIdx++){
            char[] keyArr = keymap[keyIdx].toCharArray();
            for(int k=0;k<keyArr.length;k++){
                keysMap.put(keyArr[k],Math.min(keysMap.getOrDefault(keyArr[k],100),k+1));
            }
        }
        for(int i=0;i< targets.length;i++){
            for(char ch: targets[i].toCharArray()){
                if(!keysMap.containsKey(ch)){
                    answer[i]=-1;
                    break;
                }
                answer[i]+=keysMap.get(ch);
            }
        }
        return answer;
    }
}