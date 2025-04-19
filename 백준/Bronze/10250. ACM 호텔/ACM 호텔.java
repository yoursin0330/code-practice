import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int h, w, n;
        int y,x;
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            y = (n-1)%h+1;
            x=(n-1)/h+1;
            if(x>9) sb.append(y+""+x+"\n");
            else sb.append(y+"0"+x+"\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}