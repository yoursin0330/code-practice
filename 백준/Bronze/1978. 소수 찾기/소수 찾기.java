import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(st.nextToken());
            if(check(x)) cnt++;
        }
        System.out.print(cnt);
    }
    boolean check(int x){
        if(x==1) return false;
        for(int i=2; i<=(int)Math.sqrt(x); i++){
            if(x%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}