import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[][] cnts = new int[41][2];
        cnts[0][0] = 1;
        cnts[1][1] = 1;
        for(int i=2;i<41;i++){
            cnts[i][0] = cnts[i-1][0] + cnts[i-2][0];
            cnts[i][1] = cnts[i-1][1] + cnts[i-2][1];
        }
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(cnts[n][0]+" "+cnts[n][1]+"\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}