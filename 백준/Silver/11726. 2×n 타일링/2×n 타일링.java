import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1){
            System.out.print(1);
            return;
        }
        int[] dp = new int[n];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%10007;
        }
        System.out.print(dp[n-1]);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}