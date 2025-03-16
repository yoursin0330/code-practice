import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        int[] lines = new int[k];
        long high = 0;
        for(int i=0;i<k;i++){
            lines[i] = Integer.parseInt(br.readLine());
            high = Math.max(high,lines[i]);
        }
        long low=1, mid;
        while(low<=high){
            mid=(low+high)/2;

            long cnt=0;
            for(int i=0;i<k;i++){
                cnt+=lines[i]/mid;
            }

            if(cnt>=n) low=mid+1; // 더 긴 길이 탐색하기
            else high=mid-1; // 더 짧은 길이 탐색
        }
        System.out.print(high);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}