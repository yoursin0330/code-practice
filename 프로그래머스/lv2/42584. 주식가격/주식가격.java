import java.util.*;
class Solution {
   public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(0);
        for(int i=1;i<prices.length;i++){
            Deque<Integer> newDeque = new ArrayDeque<>();
            while(!deque.isEmpty()){
                int x=deque.pop();
                answer[x]++;
                if(prices[x]<=prices[i]) newDeque.push(x);
            }
            newDeque.push(i);
            deque=newDeque;
        }
        return answer;
    }
}