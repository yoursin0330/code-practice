import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append("IO");
        }
        sb.append("I");
        String key = sb.toString();
        for(int i=0;i<m-2*n;i++){
            if(str.startsWith(key, i)) cnt++;
        }
        System.out.print(cnt);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}