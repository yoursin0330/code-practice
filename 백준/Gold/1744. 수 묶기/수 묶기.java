import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans=0;
        int idx=n-1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        while(idx>-1){
            if(idx==0) ans+=arr[idx--];
            else if(arr[idx]>0){
                if(arr[idx-1]>0){
                    if(arr[idx]*arr[idx-1]>arr[idx]+arr[idx-1]){
                        ans+=arr[idx]*arr[idx-1];
                    }
                    else ans+=arr[idx]+arr[idx-1];
                    idx-=2;
                }
                else{
                    ans+=arr[idx];
                    idx--;
                }
            }
            else break;
        }
        int minusIdx=idx;
        idx=0;
        while(idx<=minusIdx){
            if(idx==minusIdx){
                ans+=arr[idx];
                break;
            }
            else if(arr[idx]*arr[idx+1]>arr[idx]+arr[idx+1]){
                ans+=arr[idx]*arr[idx+1];
            }
            else ans+=arr[idx]+arr[idx+1];
            idx+=2;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}