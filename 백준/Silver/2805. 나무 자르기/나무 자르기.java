import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).sorted().toArray();
        long sum;
        int high=arr[n-1]-1, low=1, mid;
        while(low<=high) {
            sum=0;
            mid = (low+high)/2;
            for(int i=n-1;i>-1;i--){
                if(arr[i]<mid) break;
                sum+=arr[i]-mid;
            }
            if(sum<m) high = mid-1;//높이 낮추기
            else low = mid+1;
        }
        System.out.print(high);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}