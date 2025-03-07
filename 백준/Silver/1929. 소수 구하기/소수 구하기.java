import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()), n =Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(;m<=n;m++){
            int k=1; boolean check=true;
            while(++k<=(int)Math.sqrt(m)){
                if(m%k==0){
                    check=false;
                    break;
                }
            }
            if(check && m>1) sb.append(m+"\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}