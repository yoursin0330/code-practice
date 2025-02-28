import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[1] = 1;
        if(n>1) dp[2] = 3;
        for(int i=3;i<=n;i++) dp[i] = (dp[i-2]*2%10007+dp[i-1])%10007;
        System.out.print(dp[n]);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}