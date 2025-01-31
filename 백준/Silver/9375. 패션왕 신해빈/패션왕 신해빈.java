import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int idx = 0;idx<t;idx++){
            map.clear();
            int n = Integer.parseInt(br.readLine());
            int ans = 1;
            if(n==0) ans = 0;
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key,0)+1);
            }
            for(Integer cnt :map.values()){
                ans*=(cnt+1);
            }
            sb.append(Math.max(ans-1, 0)).append("\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}