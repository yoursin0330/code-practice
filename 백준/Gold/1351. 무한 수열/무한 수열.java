import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    Map<Long, Long> map = new HashMap<>();
    long n, p, q;
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        p = Long.parseLong(st.nextToken());
        q = Long.parseLong(st.nextToken());

        map.put((long)0,(long)1);

        System.out.print(dp(n));
    }
    long dp(long i){
        if(map.containsKey(i)) return map.get(i);
        map.put(i, dp(i/p)+dp(i/q));
        return map.get(i);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}