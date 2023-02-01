import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        int[] fir= {5,1,2,3,4};
        int[] sec= {5, 2, 1, 2, 3, 2, 4, 2};
        int[] thr= {5, 3, 3, 1, 1, 2, 2, 4, 4, 5};
        int[] count=new int[3];
        for (int i=1;i<=answers.length;i++) {
        	if (fir[i%5]==answers[i-1]) count[0]++;
			if (sec[i%8]==answers[i-1]) count[1]++;
			if (thr[i%10]==answers[i-1]) count[2]++;
		}
        int x=Math.max(count[0],Math.max(count[1],count[2]));
        for(int i=0;i<count.length;i++) {
        	if (x==count[i]) list.add(i+1);
        }
        answer=new int[list.size()];
        for(int i=0;i<list.size();i++) answer[i]=list.get(i);
        return answer;
    }
}