import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && dp[j]>dp[i]) dp[i]=dp[j];
            }
            dp[i]++;
            max = Math.max(dp[i],max);
        }
        System.out.print(max);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}