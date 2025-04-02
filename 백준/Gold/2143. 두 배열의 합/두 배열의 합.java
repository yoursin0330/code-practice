import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long cnt = 0;
        long t = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            a[i] = a[i-1] + Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        long[] b = new long[m+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=m;i++){
            b[i] = b[i-1] + Integer.parseInt(st.nextToken());
        }
        Map<Long, Long> mapA = new HashMap<>();
        Map<Long, Long> mapB = new HashMap<>();
        cntAbleNums(a,n,mapA);
        cntAbleNums(b,m,mapB);
        long k, v;
        for(Map.Entry<Long, Long> entry: mapA.entrySet()){
            k = entry.getKey(); v = entry.getValue();
            if(mapB.containsKey(t-k)) cnt+=mapB.get(t-k)*v;
        }
        System.out.println(cnt);
    }
    void cntAbleNums(long[] arr, int len, Map<Long, Long> map){
        long x;
        for(int i=0;i<=len;i++){
            for(int j=i+1;j<=len;j++){
                x = arr[j]-arr[i];
                map.put(x, map.getOrDefault(x,(long)0)+1);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}