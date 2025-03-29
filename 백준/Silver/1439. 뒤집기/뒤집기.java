import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int len = arr.length;
        int cnt =0;
        for(int i=1;i<len;i++){
            if(arr[i-1]!=arr[i]) cnt++;
        }
        System.out.print((cnt+1)/2);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}