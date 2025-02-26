import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr;
        int l;
        while(true){
            arr = br.readLine().toCharArray();
            if(arr[0]=='0') break;
            boolean check=true;
            l = arr.length;
            for(int i=0;i<l/2;i++){
                if(arr[i]==arr[l-i-1]) continue;
                else{
                    check=false;
                    break;
                }
            }
            sb.append(check?"yes\n":"no\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}