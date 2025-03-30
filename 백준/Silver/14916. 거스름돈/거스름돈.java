import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int bf;
        dp[1]=-1;
        for(int i=2;i<=n;i++){
            if(dp[i-2]<0 && (i<5 || dp[i-5]<0)) bf=-1; // 둘 다 안됨
            else if(i>4 && dp[i-5]>=0 && ((dp[i-2]>0 && dp[i-5]<dp[i-2])||dp[i-2]<0) ) // 5
                bf = dp[i-5];
            else bf = dp[i-2]; // 2
            dp[i] += (bf<0)? bf: bf+1;
        }

        System.out.print((dp[n]==0)? -1 : dp[n]);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}