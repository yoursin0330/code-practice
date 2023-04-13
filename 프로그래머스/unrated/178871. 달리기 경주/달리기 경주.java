import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> mapIndex = new HashMap<>();
        for(int i=0;i< players.length;i++){
            mapIndex.put(players[i],i);
        }
        for(String call:callings){
            int callIndex=mapIndex.get(call);
            String lostName=players[callIndex-1];
            mapIndex.replace(lostName,callIndex);
            mapIndex.replace(call, callIndex - 1);
            players[callIndex]=lostName;
            players[callIndex-1]=call;
        }
        return players;
    }
}