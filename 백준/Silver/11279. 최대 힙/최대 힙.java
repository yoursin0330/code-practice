import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int x;
        for(int i=0;i<n;i++){
            x = Integer.parseInt(br.readLine());
            if(x==0){
                if(pq.isEmpty()) sb.append("0\n");
                else sb.append(pq.poll()+"\n");
            }
            else pq.add(x);
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}