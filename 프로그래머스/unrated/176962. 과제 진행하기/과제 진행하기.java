import java.util.*;
class Solution {

    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        Stack <String[]> stack = new Stack<>(); //과목명, 남은 시간
        Map<String, String[]> assignmentsMap = new HashMap<>();
        for(String[] assignment: plans){
            assignmentsMap.put(assignment[1], new String[]{assignment[0], assignment[2]}); //"korean", "30"
        }
        List<String> keyList = new ArrayList<>(assignmentsMap.keySet());
        keyList.sort(String::compareTo);
        int keyIdx=0;
        int resIdx=0;
        int now=0;
        while(keyIdx<keyList.size()){
            if(stack.isEmpty()){
                String[] thisAssignment = assignmentsMap.get(keyList.get(keyIdx));
                String[] time=keyList.get(keyIdx).split(":");
                now = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
                stack.push(thisAssignment);
                keyIdx++;
            }
            if(keyIdx>=keyList.size()) break;
            String[] ss = stack.pop();
            int ssTime= Integer.parseInt(ss[1])+now;
            String[] newAssignment = assignmentsMap.get(keyList.get(keyIdx));
            String[] newTimes=keyList.get(keyIdx).split(":");
            int newTime = Integer.parseInt(newTimes[0]) * 60 + Integer.parseInt(newTimes[1]); //새로운 과제 시작시간
            if(ssTime<=newTime){
                answer[resIdx++] = ss[0];
                now=ssTime;
            }
            else{
                ss[1] = String.valueOf(ssTime - newTime);
                stack.push(ss);
                now=newTime;
                stack.push(newAssignment);
                keyIdx++;
            }
        }
        while(!stack.isEmpty()) answer[resIdx++] = stack.pop()[0];
        return answer;
    }
}