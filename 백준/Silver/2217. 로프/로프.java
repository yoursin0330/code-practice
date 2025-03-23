import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=n-1;i>-1;i--){
            if(arr[i]*(n-i)>ans){
                ans=arr[i]*(n-i);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}