import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static StringBuilder ans = new StringBuilder();
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=1;i<=n-m+1;i++){
            dfs(n,m-1,i+1,new String(String.valueOf(i)));
        }
        System.out.print(ans);
    }
    void dfs(int n, int m, int idx, String str){
        if(m==0){
            ans.append(str+"\n");
            return;
        }
        for(int i=idx;i<=n-m+1;i++){
            dfs(n,m-1,i+1, new String(str+" "+i));
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}