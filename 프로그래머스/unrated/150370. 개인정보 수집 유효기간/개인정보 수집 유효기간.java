import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> idxList = new ArrayList<Integer>();
        Map<String, Integer> termsMap = new HashMap<>();

        for(String s:terms){
            String[] ss=s.split(" ");
            termsMap.put(ss[0],Integer.parseInt(ss[1]));
        }
        String[] tt = today.split("\\.");
        long todayDates=Long.parseLong(tt[0]) * 12 * 28 + Long.parseLong(tt[1]) * 28 + Long.parseLong(tt[2]);
        for(int i=0;i< privacies.length;i++){
            String[] ss = privacies[i].split(" ");
            String[] dateArr = ss[0].split("\\.");
            long dates=Long.parseLong(dateArr[0]) * 12 * 28 + (Long.parseLong(dateArr[1])+ termsMap.get(ss[1]) )* 28 + Long.parseLong(dateArr[2]);
            if(dates<=todayDates) idxList.add(i+1);
        }

        int[] answer  = new int[idxList.size()];
        for(int i=0;i<idxList.size();i++){
            answer[i] = idxList.get(i);
        }
        return answer;
    }
}