import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
        int[] arr = new int[a+1];
        arr[0]=1;
        for(int i=1;i<=a;i++){
            arr[i]=arr[i-1]*i;
        }
        System.out.println(arr[a]/arr[a-b]/arr[b]);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}