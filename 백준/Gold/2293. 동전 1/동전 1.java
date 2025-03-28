import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //동전 종류
        int k = Integer.parseInt(st.nextToken()); //가치 합
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coins);
        int[] dp = new int[k+1];
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=coins[i];j<=k;j++){
                dp[j] += dp[j-coins[i]];
            }
        }
        System.out.print(dp[k]);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}