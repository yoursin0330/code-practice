import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (a,b)->{
           if(a[0] == b[0]) return Integer.compare(a[1],b[1]);
           return Integer.compare(a[0],b[0]);
        });
        StringBuilder sb = new StringBuilder();
        for(int[] pt : arr) sb.append(pt[0]+" "+pt[1]+"\n");
        System.out.print(sb);
        
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}