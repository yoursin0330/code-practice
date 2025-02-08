import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n][3];
        cost[0] = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for(int i = 1; i < n; i++){
            cost[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            cost[i][0] +=Math.min(cost[i-1][1], cost[i-1][2]);
            cost[i][1] +=Math.min(cost[i-1][0], cost[i-1][2]);
            cost[i][2] +=Math.min(cost[i-1][0], cost[i-1][1]);
        }
        System.out.print(Math.min(Math.min(cost[n-1][0], cost[n-1][1]),cost[n-1][2]));
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}