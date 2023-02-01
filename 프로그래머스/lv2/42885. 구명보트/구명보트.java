import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        //한 번에 최대 2명!!
        //크기 순으로(큰거~작은거)
        Arrays.sort(people); 
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0;i<people.length;i++) deque.addLast(people[i]);//가장 작은 게 맨 앞!
        int big;
        while(!deque.isEmpty()) { 
        	answer++;
        	big=deque.removeLast();
        	if(!deque.isEmpty()&&big+deque.peekFirst()<=limit) deque.removeFirst();
        }
        return answer;
    }
}