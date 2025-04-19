import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String str: participant){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        int x;
        for(String str: completion){
            x = map.get(str);
            if(x==1) map.remove(str);
            else map.put(str, x-1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet())
            answer= entry.getKey();
        return answer;
    }
}