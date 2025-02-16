import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];
        for(int i=0;i<15;i++) arr[0][i] = i;
        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                arr[i][j] = arr[i][j-1]+arr[i-1][j];
            }
        }
        int k,n;
        for(int i=0;i<t;i++){
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n]+"\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}