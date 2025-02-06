import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] points = new int[n];
        for(int i = 0; i < n; i++){
            points[i] = Integer.parseInt(br.readLine());
        }
        if(n==1){
            System.out.print(points[0]);
            return;
        }
        long[][] arr = new long[n][2];
        arr[0][1] = points[0];
        arr[1][0] = points[1];
        arr[1][1] = arr[0][1]+points[1];
        for(int i=2; i < n; i++){
            arr[i][0] = Math.max(arr[i-2][0], arr[i-2][1]) + points[i];
            arr[i][1] = arr[i-1][0]+points[i];
        }
        System.out.print(Math.max(arr[n-1][0], arr[n-1][1]));
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}