import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[][] meeting = new int[n][2];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            meeting[i][0] = Integer.parseInt(st.nextToken());
            meeting[i][1] = Integer.parseInt(st.nextToken());
        }
//        boolean[] time = new boolean[maxTime+1];
        Arrays.sort(meeting, (a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        int maxTime = 0;
        for(int[] m: meeting){
            if(m[0]>=maxTime) {
                maxTime=m[1];
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}