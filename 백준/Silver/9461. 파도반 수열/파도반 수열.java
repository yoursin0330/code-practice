import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        long p[] =new long[101];
        p[1]=p[2]=p[3]=1;
        p[4]=p[5]=2;
        p[6]=3;
        for(int i=7;i<=100;i++){
            p[i]=p[i-1]+p[i-5];
        }
        for(int i=0;i<t;i++){
            sb.append(p[Integer.parseInt(br.readLine())]+"\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}