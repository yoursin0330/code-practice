import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt=0;
        char[] arr;
        int dn, len;
        for(int i=1;i<=n;i++){
            arr = String.valueOf(i).toCharArray();
            len = arr.length;
            if(len==1){
                cnt++;
                continue;
            }
            dn = arr[0]-arr[1];
            for(int j=1;j<len-1;j++) {
                if (dn != arr[j] - arr[j + 1]) {
                    cnt--;
                    break;
                }
            }
            cnt++;
        }
        System.out.print(cnt);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}