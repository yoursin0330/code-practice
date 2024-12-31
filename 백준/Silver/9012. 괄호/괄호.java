import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            char[] ps = br.readLine().toCharArray();
            int check=0;
            for(int j=0;j<ps.length;j++){
                if (ps[j]=='(') check++;
                else check--;
                if(check<0)break;
            }
            if(check!=0) sb.append("NO\n");
            else sb.append("YES\n");
        }

        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}