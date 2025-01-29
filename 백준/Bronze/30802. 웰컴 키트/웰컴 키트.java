import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] shirtCnts = new int[6];
        for(int i=0;i<6;i++){
            shirtCnts[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int tCnt = 0;
        for(int i=0;i<6;i++){
            tCnt+=shirtCnts[i]/t;
            if(shirtCnts[i]%t>0)tCnt++;
        }
        sb.append(tCnt).append("\n");
        sb.append(n/p).append(" ").append(n%p);
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}