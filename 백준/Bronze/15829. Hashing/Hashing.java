import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        int ans = 0;
        for(int i=0;i<l;i++){
            ans+=(arr[i]-'a'+1)*(int)Math.pow(31,i)%1234567891;
        }
        System.out.print(ans);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}