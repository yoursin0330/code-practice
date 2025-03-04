import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        int n = sb.length(); // 문자열 길이
        int m = Integer.parseInt(br.readLine()); // 명령어 수
        int idx=n;
        char[] arr;

        for(int i=0;i<m;i++){
            arr=br.readLine().toCharArray();
            switch (arr[0]){
                case 'L': idx = Math.max(0, idx-1); break;
                case 'D' : idx = Math.min(n,idx+1); break;
                case 'B' :
                    if(idx==0) break;
                    sb.deleteCharAt(--idx); n--; break;
                case 'P' : sb.insert(idx++,arr[2]); n++; break;
            }
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}