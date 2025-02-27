import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Boolean> arr = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            arr.put(Integer.parseInt(st.nextToken()),true);
        }
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            sb.append(arr.containsKey(Integer.parseInt(st.nextToken()))?"1\n":"0\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}