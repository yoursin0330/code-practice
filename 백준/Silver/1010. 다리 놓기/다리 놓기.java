import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i< t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            if(n==1) ans.append(m).append('\n');
            else {
                n = Math.min(n, m-n);
                ans.append(fact(m, n)/fact(n, n)).append('\n');
            }
        }
        System.out.println(ans);
    }

    long fact(int x, int cnt){
        if(cnt==0) return 1;
        else return x*fact(x-1, cnt-1);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}