import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int sum = 64;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Map.Entry<Integer, Integer> stick;
        map.put(64, 1);
        while(sum>x) {
            stick = map.firstEntry();
            if (stick.getValue()==1)
                map.remove(stick.getKey());
            else
                map.put(stick.getKey(), stick.getValue()-1);
            int newStick = stick.getKey()/2;
            if(sum-newStick>=x){ //버림
                map.put(newStick,1);
                sum-=newStick;
            }
            else
                map.put(newStick,2);
        }
        System.out.println(map.values().stream().reduce(0, Integer::sum));
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}