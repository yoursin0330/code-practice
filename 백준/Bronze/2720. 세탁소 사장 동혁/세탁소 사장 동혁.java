import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] coins = new int[]{25, 10, 5, 1};
        for(int i=0;i<t;i++){
            int x = Integer.parseInt(br.readLine());
            for(int c=0;c<4;c++){
                sb.append(x/coins[c]).append(" ");
                x%=coins[c];
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}