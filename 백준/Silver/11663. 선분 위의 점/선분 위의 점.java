import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    int[] coord;
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken()); // 점
        int m =Integer.parseInt(st.nextToken()); // 선분

        coord = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) coord[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(coord);
        StringBuilder sb =  new StringBuilder();
        int min, max, minIdx, maxIdx, ans;

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            min=Integer.parseInt(st.nextToken());
            max=Integer.parseInt(st.nextToken());
            minIdx = binary(0,n-1,min);
            maxIdx = binary(0,n-1,max);
            ans = maxIdx-minIdx;
            if(minIdx>-1 && coord[minIdx]==min) ans++;
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
    int binary(int low, int high, int target){ //idx, idx, target value
        if(low>high) return high;
        int mid = (low+high)/2;
        int x = coord[mid];
        if(x==target) return mid;
        else if(x<target) return binary(mid+1,high,target);
        else return binary(low,mid-1,target);
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
