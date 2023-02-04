import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> counts = new HashMap<Integer,Integer>();
        for(int x: tangerine){
            counts.put(x,counts.getOrDefault(x,0)+1);
            //map의 key 값으로 해당 숫자를 넣고, 그 숫자의 개수를 value로 넣는 형식
        }
        List<Integer> countsList = new ArrayList<>(counts.keySet());
        Collections.sort(countsList, (num, count)->counts.get(count)-counts.get(num));
        for(Integer num: countsList){
            answer++;
            k-=counts.get(num);
            if(k<=0) break;
        }
        return answer;
    }
}