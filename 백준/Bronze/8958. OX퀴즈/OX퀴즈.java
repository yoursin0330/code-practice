import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t=0;t<n;t++){
            char[] chars = br.readLine().toCharArray();
            int end=-1;
            int ans=0;
            for(int i=0;i<chars.length;i++){
                if(chars[i]=='X'){
                    end=i;
                }else{
                    ans+=i-end;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
