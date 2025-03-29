import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //도시 개수
        int[] road = new int[n-1];
        int[] price = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n-1;i++){
            road[i]=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n-1;i++){
            price[i]=Integer.parseInt(st.nextToken());
        }

        int idx=0;
        long ans=0;
        int t, roadLen;
        while(idx<n-1){
            t=idx+1; roadLen=road[idx];
            while(t<n && price[t]>=price[idx]){
                roadLen+=road[t];
                t++;
            }
            ans+= (long)roadLen *price[idx];
            idx=t;
        }
        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}