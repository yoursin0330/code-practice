import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        PriorityQueue<String[]> pq = new PriorityQueue<>(((a,b)-> {
            int n1 = Integer.parseInt(a[0]);
            int n2 = Integer.parseInt(b[0]);
            if(n1==n2)
                return Integer.compare(Integer.parseInt(a[2]),Integer.parseInt(b[2]));
            return Integer.compare(n1,n2);
        }));
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            pq.add(new String[]{st.nextToken(), st.nextToken(), String.valueOf(i)});
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            String[] x = pq.poll();
            sb.append(x[0]+" "+x[1]+"\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}