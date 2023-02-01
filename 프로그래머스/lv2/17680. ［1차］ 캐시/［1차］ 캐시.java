import java.util.*;
//queue를 사용해서, 사이즈가 cacheSize 넘으면 제일 아래 것 삭제
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Deque <String> queue = new ArrayDeque<>();
        for(int i=0;i<cities.length;i++) {
            String str=cities[i].toLowerCase();
        	if (queue.contains(str)){
        		queue.remove(str);
        		queue.addLast(str);
        		answer++; //cache hit
        	}
        	else {
        		queue.addLast(str);
                answer+=5;
        	}
        	if(queue.size()>cacheSize) {
        		queue.removeFirst();
        	}
        	
        }
        return answer;
    }
}