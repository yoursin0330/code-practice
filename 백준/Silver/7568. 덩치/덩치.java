import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] ans = new int[n];
        int[][] ppl = new int[n][2];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            ppl[i][0] = Integer.parseInt(st.nextToken());
            ppl[i][1] = Integer.parseInt(st.nextToken());
            ans[i]=1;
            for(int j=i-1;j>=0;j--){
                if(ppl[i][0]>ppl[j][0] && ppl[i][1]>ppl[j][1]) ans[j]++;
                else if (ppl[i][0]<ppl[j][0] && ppl[i][1]<ppl[j][1]) ans[i]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int x:ans) sb.append(x+" ");
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}