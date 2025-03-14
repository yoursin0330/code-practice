import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n, m;
        Deque<int[]> deque = new ArrayDeque<>();
        TreeMap<Integer, Integer> cnt = new TreeMap<>(Collections.reverseOrder());
        Map.Entry<Integer,Integer> entry;

        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                int input = Integer.parseInt(st.nextToken());
                deque.add(new int[]{input,j});
                cnt.put(input, cnt.getOrDefault(input,0)+1);
            }
            int idx=1;
            int[] x;
            while(!deque.isEmpty()){
                x=deque.pollFirst();
                entry = cnt.firstEntry();
                if(entry.getKey()!=x[0]) deque.addLast(x);
                else{ //최대값일때
                    if(x[1]==m) break;
                    idx++;
                    if(entry.getValue()==1) cnt.pollFirstEntry();
                    else cnt.put(entry.getKey(), entry.getValue()-1);
                }
            }
            sb.append(idx+"\n");
            cnt.clear();
            deque.clear();
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}