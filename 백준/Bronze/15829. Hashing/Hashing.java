import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        long ans = 0;
        for(int i=l-1;i>=0;i--){
            ans=ans*31%1234567891;
            ans+=(arr[i]-96);
            ans%=1234567891;
        }
        System.out.print(ans);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}