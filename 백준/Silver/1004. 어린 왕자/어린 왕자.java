import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int[] start = new int[2];
        int[] dest = new int[2];
        int n; //행성 개수
        int[][] c;
        int cnt;
        int ls, ld, r2;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine()); //좌표
            start[0] = Integer.parseInt(st.nextToken());
            start[1] = Integer.parseInt(st.nextToken());
            dest[0] = Integer.parseInt(st.nextToken());
            dest[1] = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(br.readLine());
            c = new int[n][3];
            cnt=0;
            for(int j=0;j<n;j++){
                st = new StringTokenizer(br.readLine()); //좌표
                c[j][0] = Integer.parseInt(st.nextToken());
                c[j][1] = Integer.parseInt(st.nextToken());
                c[j][2] = Integer.parseInt(st.nextToken());
                ls = (start[0]- c[j][0])*(start[0]- c[j][0])+(start[1]- c[j][1])*(start[1]- c[j][1]);
                ld = (dest[0]- c[j][0])*(dest[0]- c[j][0])+(dest[1]- c[j][1])*(dest[1]- c[j][1]);
                r2 = c[j][2]*c[j][2];
                if((ls>r2 && ld<r2) || (ls<r2 && ld>r2)){
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}
