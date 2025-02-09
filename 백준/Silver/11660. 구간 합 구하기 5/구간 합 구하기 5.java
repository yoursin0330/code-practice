import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+arr[i][j];
            }
        }
        int[] pt = new int[4];
        for(int i=0;i<m;i++){
           st = new StringTokenizer(br.readLine());
           for(int j=0;j<4;j++){
               pt[j] = Integer.parseInt(st.nextToken());
           }
           sb.append(
                   sum[pt[2]][pt[3]] - sum[pt[2]][pt[1]-1]
                           - sum[pt[0]-1][pt[3]]
                   + sum[pt[0]-1][pt[1]-1]
           ).append("\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}