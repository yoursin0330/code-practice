import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt=0;
        long ans=665;
        while(cnt<n){
            ans++;
            if(String.valueOf(ans).contains("666")) cnt++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}