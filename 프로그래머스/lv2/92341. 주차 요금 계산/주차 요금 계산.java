import java.util.*;
class Solution { 
    Map<Integer,Integer> carSumTime = new TreeMap<>(); //누적 시간
    Map<Integer, String> carIn = new HashMap<>(); //입차 시간
    public void calTime(int carNum, String carOut){
        String[] inTime = carIn.get(carNum).split(":");
        String[] outTime = carOut.split(":");
        int time = (Integer.parseInt(outTime[0])-Integer.parseInt(inTime[0]))*60 +Integer.parseInt(outTime[1])-Integer.parseInt(inTime[1]);
        carSumTime.put(carNum, carSumTime.getOrDefault(carNum, 0)+time);
    }
    public int[] solution(int[] fees, String[] records) {

        for(String ss: records){
            String[] line = ss.split(" ");
            int carNum=Integer.parseInt(line[1]);
            if(line[2].equals("IN")) 
                carIn.put(carNum,line[0]);
            else{ //out
                calTime(carNum,line[0]);
                carIn.remove(carNum);
            }
        }
        for(int carNum: carIn.keySet()){
            calTime(carNum, "23:59");
        }
        int[] answer = new int[carSumTime.size()];
        int idx=0;
        //Collection<Integer> list = carSumTime.values();
        for(int x:carSumTime.values()){
            if (x<=fees[0]) answer[idx]=fees[1];
            else answer[idx]=fees[1]+(int)Math.ceil((x-fees[0])/(double)fees[2])*fees[3];
            System.out.println(answer[idx]);
            idx++;
        }
        return answer;
    }
}