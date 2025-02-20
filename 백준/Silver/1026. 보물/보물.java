import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i]*b[n-i-1];
        }
        System.out.print(sum);

    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}