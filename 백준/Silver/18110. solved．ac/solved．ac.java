import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 의견 수
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int cut = Math.round((float)n*15/100);
        int sum=0;
        for(int j=cut;j<n-cut;j++){
            sum+=arr[j];
        }
        System.out.println(Math.round((float)sum/(n-cut*2)));
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}