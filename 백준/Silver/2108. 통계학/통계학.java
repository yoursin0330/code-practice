import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            sum+=x;
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(Math.round((float)sum/n));//평균
        int cnt = n/2+1;
        int center = 0;
        boolean isCenter = false;
        int freqCnt=0;
        List<Integer> freqList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> set: map.entrySet()){
            cnt-=set.getValue();
            if(freqCnt==set.getValue()){
                freqList.add(set.getKey());
                freqCnt = set.getValue();
            }
            else if(freqCnt<set.getValue()){
                freqList.clear();
                freqList.add(set.getKey());
                freqCnt = set.getValue();
            }
            if(!isCenter&&cnt<=0){
                center = set.getKey();
                isCenter=true;
            }
        }
        System.out.println(center);
        System.out.println(freqList.get(Math.max(0,freqList.size()-2)));
        System.out.println(map.firstKey()-map.lastKey()); //범위
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}